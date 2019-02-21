package com.fkorotkov.kotlin.util

import com.google.common.reflect.ClassPath
import kotlin.reflect.KClass

object ClassUtil {
  fun findAllClassesOnClasspath(): Collection<KClass<*>> {
    return ClassPath.from(this::class.java.classLoader).allClasses.mapNotNull {
      try {
        it.load().kotlin
      } catch (e: Throwable) {
        null
      }
    }
  }
}

val <T: Any> KClass<T>.packageName: String?
  get() = qualifiedName?.substringBeforeLast('.')

val <T: Any> KClass<T>.uniqueSimpleAlias: String?
  get() = this.qualifiedName?.split('.')?.takeLast(2)?.joinToString(separator = "_") ?: this.simpleName
