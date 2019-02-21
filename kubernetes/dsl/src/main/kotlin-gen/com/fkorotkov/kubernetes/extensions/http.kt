// GENERATED
package com.fkorotkov.kubernetes.extensions

import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue as extensions_HTTPIngressRuleValue
import io.fabric8.kubernetes.api.model.extensions.IngressRule as extensions_IngressRule


fun  extensions_IngressRule.`http`(block: extensions_HTTPIngressRuleValue.() -> Unit = {}) {
  if(this.`http` == null) {
    this.`http` = extensions_HTTPIngressRuleValue()
  }

  this.`http`.block()
}

