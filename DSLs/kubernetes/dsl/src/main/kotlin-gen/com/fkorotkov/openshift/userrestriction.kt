// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec as model_RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.UserRestriction as model_UserRestriction


fun  model_RoleBindingRestrictionSpec.`userrestriction`(block: model_UserRestriction.() -> Unit = {}) {
  if(this.`userrestriction` == null) {
    this.`userrestriction` = model_UserRestriction()
  }

  this.`userrestriction`.block()
}

