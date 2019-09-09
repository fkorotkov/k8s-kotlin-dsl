// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec as model_OpenshiftRoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.UserRestriction as model_UserRestriction


fun  model_OpenshiftRoleBindingRestrictionSpec.`userrestriction`(block: model_UserRestriction.() -> Unit = {}) {
  if(this.`userrestriction` == null) {
    this.`userrestriction` = model_UserRestriction()
  }

  this.`userrestriction`.block()
}

