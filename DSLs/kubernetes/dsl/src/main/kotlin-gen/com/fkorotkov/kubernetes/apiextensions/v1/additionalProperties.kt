// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrBool as v1_JSONSchemaPropsOrBool


fun  v1_JSONSchemaProps.`additionalProperties`(block: v1_JSONSchemaPropsOrBool.() -> Unit = {}) {
  if(this.`additionalProperties` == null) {
    this.`additionalProperties` = v1_JSONSchemaPropsOrBool()
  }

  this.`additionalProperties`.block()
}

