// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction as model_GroupRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec as model_RoleBindingRestrictionSpec


fun  model_RoleBindingRestrictionSpec.`grouprestriction`(block: model_GroupRestriction.() -> Unit = {}) {
  if(this.`grouprestriction` == null) {
    this.`grouprestriction` = model_GroupRestriction()
  }

  this.`grouprestriction`.block()
}

