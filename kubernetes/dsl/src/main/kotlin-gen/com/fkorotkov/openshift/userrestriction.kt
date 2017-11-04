// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.UserRestriction


fun  RoleBindingRestrictionSpec.`userrestriction`(block: UserRestriction.() -> Unit = {}) {
  if(this.`userrestriction` == null) {
    this.`userrestriction` = UserRestriction()
  }

  this.`userrestriction`.block()
}

