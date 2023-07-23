// GENERATED
package com.fkorotkov.kubernetes.batch.v1

import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicyOnExitCodesRequirement as v1_PodFailurePolicyOnExitCodesRequirement
import io.fabric8.kubernetes.api.model.batch.v1.PodFailurePolicyRule as v1_PodFailurePolicyRule


fun  v1_PodFailurePolicyRule.`onExitCodes`(block: v1_PodFailurePolicyOnExitCodesRequirement.() -> Unit = {}) {
  if(this.`onExitCodes` == null) {
    this.`onExitCodes` = v1_PodFailurePolicyOnExitCodesRequirement()
  }

  this.`onExitCodes`.block()
}

