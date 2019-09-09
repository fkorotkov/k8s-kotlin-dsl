// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.ExternalDocumentation as apiextensions_ExternalDocumentation
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps


fun  apiextensions_JSONSchemaProps.`externalDocs`(block: apiextensions_ExternalDocumentation.() -> Unit = {}) {
  if(this.`externalDocs` == null) {
    this.`externalDocs` = apiextensions_ExternalDocumentation()
  }

  this.`externalDocs`.block()
}

