// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinitionVersion as v1_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceValidation as v1_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaProps as v1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrArray as v1_JSONSchemaPropsOrArray
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrBool as v1_JSONSchemaPropsOrBool
import io.fabric8.kubernetes.api.model.apiextensions.v1.JSONSchemaPropsOrStringArray as v1_JSONSchemaPropsOrStringArray


fun  v1_CustomResourceDefinitionVersion.`schema`(block: v1_CustomResourceValidation.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1_CustomResourceValidation()
  }

  this.`schema`.block()
}


fun  v1_JSONSchemaPropsOrArray.`schema`(block: v1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1_JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  v1_JSONSchemaPropsOrBool.`schema`(block: v1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1_JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  v1_JSONSchemaPropsOrStringArray.`schema`(block: v1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1_JSONSchemaProps()
  }

  this.`schema`.block()
}

