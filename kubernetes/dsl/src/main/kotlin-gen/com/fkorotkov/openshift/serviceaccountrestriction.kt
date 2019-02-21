// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.ServiceAccountRestriction


fun  OpenshiftRoleBindingRestrictionSpec.`serviceaccountrestriction`(block: ServiceAccountRestriction.() -> Unit = {}) {
  if(this.`serviceaccountrestriction` == null) {
    this.`serviceaccountrestriction` = ServiceAccountRestriction()
  }

  this.`serviceaccountrestriction`.block()
}

