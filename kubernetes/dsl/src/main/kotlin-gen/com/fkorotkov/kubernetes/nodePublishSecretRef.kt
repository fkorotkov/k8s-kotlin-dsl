// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CSIPersistentVolumeSource
import io.fabric8.kubernetes.api.model.SecretReference


fun  CSIPersistentVolumeSource.`nodePublishSecretRef`(block: SecretReference.() -> Unit = {}) {
  if(this.`nodePublishSecretRef` == null) {
    this.`nodePublishSecretRef` = SecretReference()
  }

  this.`nodePublishSecretRef`.block()
}

