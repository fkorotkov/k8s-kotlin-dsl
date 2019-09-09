// GENERATE
package com.fkorotkov.kubernetes.settings

import io.fabric8.kubernetes.api.model.settings.PodPreset as settings_PodPreset
import io.fabric8.kubernetes.api.model.settings.PodPresetList as settings_PodPresetList
import io.fabric8.kubernetes.api.model.settings.PodPresetSpec as settings_PodPresetSpec


fun newPodPreset(block : settings_PodPreset.() -> Unit = {}): settings_PodPreset {
  val instance = settings_PodPreset()
  instance.block()
  return instance
}


fun newPodPresetList(block : settings_PodPresetList.() -> Unit = {}): settings_PodPresetList {
  val instance = settings_PodPresetList()
  instance.block()
  return instance
}


fun newPodPresetSpec(block : settings_PodPresetSpec.() -> Unit = {}): settings_PodPresetSpec {
  val instance = settings_PodPresetSpec()
  instance.block()
  return instance
}

