// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy as model_BuildStrategy
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy as model_JenkinsPipelineBuildStrategy


fun  model_BuildStrategy.`jenkinsPipelineStrategy`(block: model_JenkinsPipelineBuildStrategy.() -> Unit = {}) {
  if(this.`jenkinsPipelineStrategy` == null) {
    this.`jenkinsPipelineStrategy` = model_JenkinsPipelineBuildStrategy()
  }

  this.`jenkinsPipelineStrategy`.block()
}

