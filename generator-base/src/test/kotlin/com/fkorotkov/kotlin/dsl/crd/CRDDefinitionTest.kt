package com.fkorotkov.kotlin.dsl.crd

import org.junit.Test
import kotlin.test.assertEquals

internal class CRDDefinitionTest {
  @Test
  fun testParsing() {
    val crd = CRDDefinition.parseFromResource("kafkaclusters-crd.json")
    assertEquals("apiextensions.k8s.io/v1beta1", crd.apiVersion)
  }
}