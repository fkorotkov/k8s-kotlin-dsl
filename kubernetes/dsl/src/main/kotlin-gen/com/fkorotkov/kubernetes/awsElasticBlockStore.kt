// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AWSElasticBlockStoreVolumeSource as model_AWSElasticBlockStoreVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec as model_PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume as model_Volume


fun  model_PersistentVolumeSpec.`awsElasticBlockStore`(block: model_AWSElasticBlockStoreVolumeSource.() -> Unit = {}) {
  if(this.`awsElasticBlockStore` == null) {
    this.`awsElasticBlockStore` = model_AWSElasticBlockStoreVolumeSource()
  }

  this.`awsElasticBlockStore`.block()
}


fun  model_Volume.`awsElasticBlockStore`(block: model_AWSElasticBlockStoreVolumeSource.() -> Unit = {}) {
  if(this.`awsElasticBlockStore` == null) {
    this.`awsElasticBlockStore` = model_AWSElasticBlockStoreVolumeSource()
  }

  this.`awsElasticBlockStore`.block()
}

