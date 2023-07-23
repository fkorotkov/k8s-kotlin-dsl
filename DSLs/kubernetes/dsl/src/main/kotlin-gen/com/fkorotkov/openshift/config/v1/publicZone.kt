// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.DNSSpec as v1_DNSSpec
import io.fabric8.openshift.api.model.config.v1.DNSZone as v1_DNSZone


fun  v1_DNSSpec.`publicZone`(block: v1_DNSZone.() -> Unit = {}) {
  if(this.`publicZone` == null) {
    this.`publicZone` = v1_DNSZone()
  }

  this.`publicZone`.block()
}

