// GENERATED
package com.fkorotkov.kubernetes.networking.v1

import io.fabric8.kubernetes.api.model.networking.v1.HTTPIngressRuleValue as v1_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.networking.v1.IngressRule as v1_IngressRule


fun  v1_IngressRule.`http`(block: v1_HTTPIngressRuleValue.() -> Unit = {}) {
  if(this.`http` == null) {
    this.`http` = v1_HTTPIngressRuleValue()
  }

  this.`http`.block()
}

