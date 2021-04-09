// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthSpec as model_OAuthSpec
import io.fabric8.openshift.api.model.OAuthTemplates as model_OAuthTemplates


fun  model_OAuthSpec.`templates`(block: model_OAuthTemplates.() -> Unit = {}) {
  if(this.`templates` == null) {
    this.`templates` = model_OAuthTemplates()
  }

  this.`templates`.block()
}

