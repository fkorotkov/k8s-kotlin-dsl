// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.LDAPAttributeMapping as v1_LDAPAttributeMapping
import io.fabric8.openshift.api.model.config.v1.LDAPIdentityProvider as v1_LDAPIdentityProvider


fun  v1_LDAPIdentityProvider.`attributes`(block: v1_LDAPAttributeMapping.() -> Unit = {}) {
  if(this.`attributes` == null) {
    this.`attributes` = v1_LDAPAttributeMapping()
  }

  this.`attributes`.block()
}

