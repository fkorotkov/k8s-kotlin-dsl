// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LDAPAttributeMapping as model_LDAPAttributeMapping
import io.fabric8.openshift.api.model.LDAPIdentityProvider as model_LDAPIdentityProvider


fun  model_LDAPIdentityProvider.`attributes`(block: model_LDAPAttributeMapping.() -> Unit = {}) {
  if(this.`attributes` == null) {
    this.`attributes` = model_LDAPAttributeMapping()
  }

  this.`attributes`.block()
}

