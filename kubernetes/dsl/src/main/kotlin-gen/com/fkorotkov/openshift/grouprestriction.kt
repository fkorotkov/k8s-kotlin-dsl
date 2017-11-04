// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec


fun  RoleBindingRestrictionSpec.`grouprestriction`(block: GroupRestriction.() -> Unit = {}) {
  if(this.`grouprestriction` == null) {
    this.`grouprestriction` = GroupRestriction()
  }

  this.`grouprestriction`.block()
}

