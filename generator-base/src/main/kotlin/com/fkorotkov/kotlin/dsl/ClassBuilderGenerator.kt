package com.fkorotkov.kotlin.dsl

import com.fkorotkov.kotlin.util.uniqueSimpleAlias
import java.io.File
import kotlin.reflect.KClass

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
    allClasses.map { "import ${it.qualifiedName} as ${it.uniqueSimpleAlias}" }.toSet().sorted().joinToString("\n")
}

${
    allClasses.joinToString("\n") { classBuilderTemplate(it) }
}
"""
  }

  private fun classBuilderTemplate(clazz: KClass<*>): String {
    return """
fun new${clazz.simpleName}(block : ${clazz.uniqueSimpleAlias}.() -> Unit = {}): ${clazz.uniqueSimpleAlias} {
  val instance = ${clazz.uniqueSimpleAlias}()
  instance.block()
  return instance
}
"""
  }

}
