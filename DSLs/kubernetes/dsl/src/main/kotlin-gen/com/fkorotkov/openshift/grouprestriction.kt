// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction as model_GroupRestriction
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec as model_OpenshiftRoleBindingRestrictionSpec


fun  model_OpenshiftRoleBindingRestrictionSpec.`grouprestriction`(block: model_GroupRestriction.() -> Unit = {}) {
  if(this.`grouprestriction` == null) {
    this.`grouprestriction` = model_GroupRestriction()
  }

  this.`grouprestriction`.block()
}

