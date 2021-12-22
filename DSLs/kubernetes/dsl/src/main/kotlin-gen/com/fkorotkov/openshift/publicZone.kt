// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DNSSpec as model_DNSSpec
import io.fabric8.openshift.api.model.DNSZone as model_DNSZone


fun  model_DNSSpec.`publicZone`(block: model_DNSZone.() -> Unit = {}) {
  if(this.`publicZone` == null) {
    this.`publicZone` = model_DNSZone()
  }

  this.`publicZone`.block()
}

