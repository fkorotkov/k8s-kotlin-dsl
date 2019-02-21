// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OpenshiftRoleBindingRestrictionSpec as model_OpenshiftRoleBindingRestrictionSpec
import io.fabric8.openshift.api.model.ServiceAccountRestriction as model_ServiceAccountRestriction


fun  model_OpenshiftRoleBindingRestrictionSpec.`serviceaccountrestriction`(block: model_ServiceAccountRestriction.() -> Unit = {}) {
  if(this.`serviceaccountrestriction` == null) {
    this.`serviceaccountrestriction` = model_ServiceAccountRestriction()
  }

  this.`serviceaccountrestriction`.block()
}

