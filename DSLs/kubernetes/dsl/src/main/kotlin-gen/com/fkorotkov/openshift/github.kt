// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildTriggerPolicy as model_BuildTriggerPolicy
import io.fabric8.openshift.api.model.GitHubIdentityProvider as model_GitHubIdentityProvider
import io.fabric8.openshift.api.model.IdentityProvider as model_IdentityProvider
import io.fabric8.openshift.api.model.WebHookTrigger as model_WebHookTrigger


fun  model_BuildTriggerPolicy.`github`(block: model_WebHookTrigger.() -> Unit = {}) {
  if(this.`github` == null) {
    this.`github` = model_WebHookTrigger()
  }

  this.`github`.block()
}


fun  model_IdentityProvider.`github`(block: model_GitHubIdentityProvider.() -> Unit = {}) {
  if(this.`github` == null) {
    this.`github` = model_GitHubIdentityProvider()
  }

  this.`github`.block()
}

