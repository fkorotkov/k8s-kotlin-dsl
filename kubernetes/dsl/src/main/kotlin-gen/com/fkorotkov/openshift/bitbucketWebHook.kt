// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BitbucketWebHookCause as model_BitbucketWebHookCause
import io.fabric8.openshift.api.model.BuildTriggerCause as model_BuildTriggerCause


fun  model_BuildTriggerCause.`bitbucketWebHook`(block: model_BitbucketWebHookCause.() -> Unit = {}) {
  if(this.`bitbucketWebHook` == null) {
    this.`bitbucketWebHook` = model_BitbucketWebHookCause()
  }

  this.`bitbucketWebHook`.block()
}

