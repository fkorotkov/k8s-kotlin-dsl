package com.fkorotkov.kubernetes.kafka

class Resources {
  var limits: Limits? = null
  var requests: Requests = Requests()
  var storage: List<Storage> = emptyList()
}