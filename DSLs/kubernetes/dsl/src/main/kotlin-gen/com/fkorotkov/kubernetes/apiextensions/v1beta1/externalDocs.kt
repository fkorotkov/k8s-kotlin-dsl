// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.ExternalDocumentation as v1beta1_ExternalDocumentation
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaProps as v1beta1_JSONSchemaProps


fun  v1beta1_JSONSchemaProps.`externalDocs`(block: v1beta1_ExternalDocumentation.() -> Unit = {}) {
  if(this.`externalDocs` == null) {
    this.`externalDocs` = v1beta1_ExternalDocumentation()
  }

  this.`externalDocs`.block()
}

