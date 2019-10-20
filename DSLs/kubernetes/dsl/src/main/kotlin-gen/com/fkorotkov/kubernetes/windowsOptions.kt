// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSecurityContext as model_PodSecurityContext
import io.fabric8.kubernetes.api.model.SecurityContext as model_SecurityContext
import io.fabric8.kubernetes.api.model.WindowsSecurityContextOptions as model_WindowsSecurityContextOptions


fun  model_PodSecurityContext.`windowsOptions`(block: model_WindowsSecurityContextOptions.() -> Unit = {}) {
  if(this.`windowsOptions` == null) {
    this.`windowsOptions` = model_WindowsSecurityContextOptions()
  }

  this.`windowsOptions`.block()
}


fun  model_SecurityContext.`windowsOptions`(block: model_WindowsSecurityContextOptions.() -> Unit = {}) {
  if(this.`windowsOptions` == null) {
    this.`windowsOptions` = model_WindowsSecurityContextOptions()
  }

  this.`windowsOptions`.block()
}

