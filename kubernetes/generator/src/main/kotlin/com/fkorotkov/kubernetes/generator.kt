package com.fkorotkov.kubernetes

import com.fkorotkov.kotlin.dsl.Generator
import io.fabric8.kubernetes.api.model.KubernetesResource
import java.io.File

fun main(args: Array<String>) {
  val outputFolder = File(args[0])
  val outputPackage = args[1]

  if (outputFolder.exists()) {
    outputFolder.deleteRecursively()
  }
  Generator.generate(
    KubernetesResource::class,
    outputFolder,
    outputPackage,
    setOf("io.fabric8.openshift.api.model")
  )
}
