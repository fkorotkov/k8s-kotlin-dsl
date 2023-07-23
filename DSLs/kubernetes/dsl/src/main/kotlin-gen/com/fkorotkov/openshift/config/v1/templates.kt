// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.OAuthSpec as v1_OAuthSpec
import io.fabric8.openshift.api.model.config.v1.OAuthTemplates as v1_OAuthTemplates


fun  v1_OAuthSpec.`templates`(block: v1_OAuthTemplates.() -> Unit = {}) {
  if(this.`templates` == null) {
    this.`templates` = v1_OAuthTemplates()
  }

  this.`templates`.block()
}

