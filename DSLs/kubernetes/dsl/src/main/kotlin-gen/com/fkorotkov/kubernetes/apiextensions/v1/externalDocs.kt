// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.ExternalDocumentation as v1_ExternalDocumentation
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps


fun  v1_JSONSchemaProps.`externalDocs`(block: v1_ExternalDocumentation.() -> Unit = {}) {
  if(this.`externalDocs` == null) {
    this.`externalDocs` = v1_ExternalDocumentation()
  }

  this.`externalDocs`.block()
}

