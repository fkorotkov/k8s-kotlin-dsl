// GENERATE
package com.fkorotkov.openshift.runtime

import io.fabric8.openshift.api.model.runtime.RawExtension as runtime_RawExtension


fun newRawExtension(block : runtime_RawExtension.() -> Unit = {}): runtime_RawExtension {
  val instance = runtime_RawExtension()
  instance.block()
  return instance
}

