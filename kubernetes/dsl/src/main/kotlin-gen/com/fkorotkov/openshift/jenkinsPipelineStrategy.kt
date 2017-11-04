// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStrategy
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy


fun  BuildStrategy.`jenkinsPipelineStrategy`(block: JenkinsPipelineBuildStrategy.() -> Unit = {}) {
  if(this.`jenkinsPipelineStrategy` == null) {
    this.`jenkinsPipelineStrategy` = JenkinsPipelineBuildStrategy()
  }

  this.`jenkinsPipelineStrategy`.block()
}

