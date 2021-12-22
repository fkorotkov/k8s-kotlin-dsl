// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.MaxAgePolicy as model_MaxAgePolicy
import io.fabric8.openshift.api.model.RequiredHSTSPolicy as model_RequiredHSTSPolicy


fun  model_RequiredHSTSPolicy.`maxAge`(block: model_MaxAgePolicy.() -> Unit = {}) {
  if(this.`maxAge` == null) {
    this.`maxAge` = model_MaxAgePolicy()
  }

  this.`maxAge`.block()
}

