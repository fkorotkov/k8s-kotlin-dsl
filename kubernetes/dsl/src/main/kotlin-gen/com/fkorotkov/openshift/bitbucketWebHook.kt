// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BitbucketWebHookCause
import io.fabric8.openshift.api.model.BuildTriggerCause


fun  BuildTriggerCause.`bitbucketWebHook`(block: BitbucketWebHookCause.() -> Unit = {}) {
  if(this.`bitbucketWebHook` == null) {
    this.`bitbucketWebHook` = BitbucketWebHookCause()
  }

  this.`bitbucketWebHook`.block()
}

