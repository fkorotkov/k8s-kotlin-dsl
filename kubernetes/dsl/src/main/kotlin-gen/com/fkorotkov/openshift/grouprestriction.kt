// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction
import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec


fun  OpenshiftRoleBindingRestrictionSpec.`grouprestriction`(block: GroupRestriction.() -> Unit = {}) {
  if(this.`grouprestriction` == null) {
    this.`grouprestriction` = GroupRestriction()
  }

  this.`grouprestriction`.block()
}

