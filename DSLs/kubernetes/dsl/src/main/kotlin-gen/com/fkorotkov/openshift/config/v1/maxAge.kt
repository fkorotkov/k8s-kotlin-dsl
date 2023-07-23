// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.MaxAgePolicy as v1_MaxAgePolicy
import io.fabric8.openshift.api.model.config.v1.RequiredHSTSPolicy as v1_RequiredHSTSPolicy


fun  v1_RequiredHSTSPolicy.`maxAge`(block: v1_MaxAgePolicy.() -> Unit = {}) {
  if(this.`maxAge` == null) {
    this.`maxAge` = v1_MaxAgePolicy()
  }

  this.`maxAge`.block()
}

