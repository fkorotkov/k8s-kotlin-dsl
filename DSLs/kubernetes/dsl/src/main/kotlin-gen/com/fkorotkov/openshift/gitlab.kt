// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy as model_BuildTriggerPolicy
import io.fabric8.openshift.api.model.GitLabIdentityProvider as model_GitLabIdentityProvider
import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.WebHookTrigger as model_WebHookTrigger


fun  model_BuildTriggerPolicy.`gitlab`(block: model_WebHookTrigger.() -> Unit = {}) {
  if(this.`gitlab` == null) {
    this.`gitlab` = model_WebHookTrigger()
  }

  this.`gitlab`.block()
}


fun  model_IdentityProvider.`gitlab`(block: model_GitLabIdentityProvider.() -> Unit = {}) {
  if(this.`gitlab` == null) {
    this.`gitlab` = model_GitLabIdentityProvider()
  }

  this.`gitlab`.block()
}

