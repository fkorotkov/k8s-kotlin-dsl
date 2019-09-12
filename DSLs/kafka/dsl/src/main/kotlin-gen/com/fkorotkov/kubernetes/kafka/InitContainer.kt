package com.fkorotkov.kubernetes.kafka

class InitContainer {
  var args: List<String>? = null
  var command: List<String> = emptyList()
  var envVar: Map<String, Any>? = null
  var image: String = ""
  var name: String = ""
}