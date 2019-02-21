// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.UserRestriction


fun  OpenshiftRoleBindingRestrictionSpec.`userrestriction`(block: UserRestriction.() -> Unit = {}) {
  if(this.`userrestriction` == null) {
    this.`userrestriction` = UserRestriction()
  }

  this.`userrestriction`.block()
}

