// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DNSSpec as model_DNSSpec
import io.fabric8.openshift.api.model.DNSZone as model_DNSZone


fun  model_DNSSpec.`privateZone`(block: model_DNSZone.() -> Unit = {}) {
  if(this.`privateZone` == null) {
    this.`privateZone` = model_DNSZone()
  }

  this.`privateZone`.block()
}

