// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ConnectionConfig as model_ConnectionConfig
import io.fabric8.openshift.api.model.HelmChartRepositorySpec as model_HelmChartRepositorySpec


fun  model_HelmChartRepositorySpec.`connectionConfig`(block: model_ConnectionConfig.() -> Unit = {}) {
  if(this.`connectionConfig` == null) {
    this.`connectionConfig` = model_ConnectionConfig()
  }

  this.`connectionConfig`.block()
}

