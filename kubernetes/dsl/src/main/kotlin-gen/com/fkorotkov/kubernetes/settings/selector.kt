// GENERATED
package com.fkorotkov.kubernetes.settings

import io.fabric8.kubernetes.api.model.LabelSelector as model_LabelSelector
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec as settings_PodPresetSpec


fun  settings_PodPresetSpec.`selector`(block: model_LabelSelector.() -> Unit = {}) {
  if(this.`selector` == null) {
    this.`selector` = model_LabelSelector()
  }

  this.`selector`.block()
}

