// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`awsElasticBlockStore`(block: AWSElasticBlockStoreVolumeSource.() -> Unit = {}) {
  if(this.`awsElasticBlockStore` == null) {
    this.`awsElasticBlockStore` = AWSElasticBlockStoreVolumeSource()
  }

  this.`awsElasticBlockStore`.block()
}


fun  Volume.`awsElasticBlockStore`(block: AWSElasticBlockStoreVolumeSource.() -> Unit = {}) {
  if(this.`awsElasticBlockStore` == null) {
    this.`awsElasticBlockStore` = AWSElasticBlockStoreVolumeSource()
  }

  this.`awsElasticBlockStore`.block()
}

