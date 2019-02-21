// GENERATE
package com.fkorotkov.kubernetes.version

import io.fabric8.kubernetes.api.model.version.Info as version_Info


fun newInfo(block : version_Info.() -> Unit = {}): version_Info {
  val instance = version_Info()
  instance.block()
  return instance
}

