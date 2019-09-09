// GENERATED
package com.fkorotkov.kubernetes.settings

import io.fabric8.kubernetes.api.model.settings.PodPreset as settings_PodPreset
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec as settings_PodPresetSpec


fun  settings_PodPreset.`spec`(block: settings_PodPresetSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = settings_PodPresetSpec()
  }

  this.`spec`.block()
}

