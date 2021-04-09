// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaProps as v1beta1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaPropsOrBool as v1beta1_JSONSchemaPropsOrBool


fun  v1beta1_JSONSchemaProps.`additionalProperties`(block: v1beta1_JSONSchemaPropsOrBool.() -> Unit = {}) {
  if(this.`additionalProperties` == null) {
    this.`additionalProperties` = v1beta1_JSONSchemaPropsOrBool()
  }

  this.`additionalProperties`.block()
}

