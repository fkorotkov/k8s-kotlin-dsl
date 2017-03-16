// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.extensions.IngressRule


fun  IngressRule.`http`(block: HTTPIngressRuleValue.() -> Unit = {}) {
  if(this.`http` == null) {
    this.`http` = HTTPIngressRuleValue()
  }

  this.`http`.block()
}

