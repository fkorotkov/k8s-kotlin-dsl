// GENERATED
package com.fkorotkov.kubernetes.networking.v1beta1

import io.fabric8.kubernetes.api.model.networking.v1beta1.HTTPIngressRuleValue as v1beta1_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressRule as v1beta1_IngressRule


fun  v1beta1_IngressRule.`http`(block: v1beta1_HTTPIngressRuleValue.() -> Unit = {}) {
  if(this.`http` == null) {
    this.`http` = v1beta1_HTTPIngressRuleValue()
  }

  this.`http`.block()
}

