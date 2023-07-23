// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.ImageSpec as v1_ImageSpec
import io.fabric8.openshift.api.model.config.v1.RegistrySources as v1_RegistrySources


fun  v1_ImageSpec.`registrySources`(block: v1_RegistrySources.() -> Unit = {}) {
  if(this.`registrySources` == null) {
    this.`registrySources` = v1_RegistrySources()
  }

  this.`registrySources`.block()
}

