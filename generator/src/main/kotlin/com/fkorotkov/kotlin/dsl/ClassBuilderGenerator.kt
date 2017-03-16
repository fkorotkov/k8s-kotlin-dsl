package com.fkorotkov.kotlin.dsl

import java.io.File
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty

object ClassBuilderGenerator {
  fun generateClassBuilders(
    outputFolder: File,
    outputPackage: String,
    outputFileName: String,
    allClasses: List<KClass<*>>
  ) {
    val destinationFolder = File(outputFolder, outputPackage.replace('.', File.separatorChar))
    if (!destinationFolder.exists()) {
      destinationFolder.mkdirs()
    }
    val destinationFile = File(destinationFolder, outputFileName)
    destinationFile.createNewFile()

    destinationFile.writeText(generateBuilders(allClasses, outputPackage))
  }

  private fun generateBuilders(allClasses: List<KClass<*>>, outputPackage: String): String {
    return """// GENERATE
package $outputPackage

${
allClasses.map { it.qualifiedName }.toSet().map { "import $it" }.sorted().joinToString("\n")
}

${
allClasses.map { classBuilderTemplate(it) }.joinToString("\n")
}
"""
  }

  private fun classBuilderTemplate(clazz: KClass<*>): String {
    return """
fun ${clazz.simpleName?.decapitalize()}(block : ${clazz.simpleName}.() -> Unit = {}): ${clazz.simpleName} {
  val instance = ${clazz.simpleName}()
  instance.block()
  return instance
}
"""
  }
}