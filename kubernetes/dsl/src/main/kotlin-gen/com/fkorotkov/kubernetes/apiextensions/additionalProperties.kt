// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool as apiextensions_JSONSchemaPropsOrBool


fun  apiextensions_JSONSchemaProps.`additionalProperties`(block: apiextensions_JSONSchemaPropsOrBool.() -> Unit = {}) {
  if(this.`additionalProperties` == null) {
    this.`additionalProperties` = apiextensions_JSONSchemaPropsOrBool()
  }

  this.`additionalProperties`.block()
}

