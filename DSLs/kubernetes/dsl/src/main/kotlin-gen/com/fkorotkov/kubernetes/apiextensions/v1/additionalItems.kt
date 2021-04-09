// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrBool as v1_JSONSchemaPropsOrBool


fun  v1_JSONSchemaProps.`additionalItems`(block: v1_JSONSchemaPropsOrBool.() -> Unit = {}) {
  if(this.`additionalItems` == null) {
    this.`additionalItems` = v1_JSONSchemaPropsOrBool()
  }

  this.`additionalItems`.block()
}

