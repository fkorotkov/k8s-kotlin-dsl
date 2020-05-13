// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RoleBindingRestrictionSpec as model_RoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.ServiceAccountRestriction as model_ServiceAccountRestriction


fun  model_RoleBindingRestrictionSpec.`serviceaccountrestriction`(block: model_ServiceAccountRestriction.() -> Unit = {}) {
  if(this.`serviceaccountrestriction` == null) {
    this.`serviceaccountrestriction` = model_ServiceAccountRestriction()
  }

  this.`serviceaccountrestriction`.block()
}

