package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kotlin.dsl.CRDGenerator
import com.fkorotkov.kotlin.dsl.Generator
import com.fkorotkov.kotlin.dsl.crd.CRDDefinition
import com.google.common.io.Resources
import io.fabric8.kubernetes.api.model.KubernetesResource
import java.io.File

fun main(args: Array<String>) {
  val outputFolder = File(args[0])

  if (outputFolder.exists()) {
    outputFolder.deleteRecursively()
  }

  CRDGenerator.generate(
      CRDDefinition.parseFromResource("kafkaclusters-crd.json"),
      outputFolder,
      "com.fkorotkov.kubernetes.kafka"
  )
}
