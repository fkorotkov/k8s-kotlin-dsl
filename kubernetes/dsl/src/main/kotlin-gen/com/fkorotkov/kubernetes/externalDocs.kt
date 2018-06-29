// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentation
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps


fun  JSONSchemaProps.`externalDocs`(block: ExternalDocumentation.() -> Unit = {}) {
  if(this.`externalDocs` == null) {
    this.`externalDocs` = ExternalDocumentation()
  }

  this.`externalDocs`.block()
}

