package com.fkorotkov.kotlin.dsl

import com.fkorotkov.kotlin.util.ClassUtil
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.isSubclassOf
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.javaField

object Generator {
  fun generate(
    clazz: KClass<*>,
    outputFolder: File,
    outputPackage: String,
    excludePackagesPrefixes: Set<String> = emptySet()
  ) {
    val allClasses = ClassUtil.findAllClassesOnClasspath().filter {
      try {
        it.isSubclassOf(clazz)
      } catch(e: Throwable) {
        false
      }
    }.filterNot { subClazz ->
      excludePackagesPrefixes.any { subClazz.java.`package`.name.startsWith(it) }
    }

    allClasses.flatMap { subClazz ->
      subClazz.memberProperties.mapNotNull {
        it as? KMutableProperty<*>
      }.filter {
        // we don't care about primitive or standard types
        val classifier = it.returnType.classifier
        classifier is KClass<*> &&
          !(classifier.qualifiedName?.startsWith("java.") ?: true) &&
          !(classifier.qualifiedName?.startsWith("kotlin.") ?: true)
      }
    }.mapNotNull { property ->
      property.javaField?.declaringClass?.kotlin?.let{ it to property }
    }.distinctBy { (clazz, property) ->
      "${clazz.qualifiedName}#${property.name}"
    }.groupBy { (_, property) ->
      property.name
    }.forEach { propertyName, clazzToProperties ->
      BuilderGenerator.generateBuildersForPropertyFile(
        outputFolder,
        outputPackage,
        "$propertyName.kt",
        clazzToProperties.sortedBy { it.first.simpleName }
      )
    }

    ClassBuilderGenerator.generateClassBuilders(
      outputFolder,
      outputPackage,
      "ClassBuilders.kt",
      allClasses
    )
  }
}