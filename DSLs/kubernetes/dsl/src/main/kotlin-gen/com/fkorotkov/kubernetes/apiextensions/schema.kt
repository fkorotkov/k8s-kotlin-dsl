// GENERATED
package com.fkorotkov.kubernetes.apiextensions

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionVersion as apiextensions_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceValidation as apiextensions_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaProps as apiextensions_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrArray as apiextensions_JSONSchemaPropsOrArray
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrBool as apiextensions_JSONSchemaPropsOrBool
import io.fabric8.kubernetes.api.model.apiextensions.JSONSchemaPropsOrStringArray as apiextensions_JSONSchemaPropsOrStringArray


fun  apiextensions_CustomResourceDefinitionVersion.`schema`(block: apiextensions_CustomResourceValidation.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = apiextensions_CustomResourceValidation()
  }

  this.`schema`.block()
}


fun  apiextensions_JSONSchemaPropsOrArray.`schema`(block: apiextensions_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = apiextensions_JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  apiextensions_JSONSchemaPropsOrBool.`schema`(block: apiextensions_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = apiextensions_JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  apiextensions_JSONSchemaPropsOrStringArray.`schema`(block: apiextensions_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = apiextensions_JSONSchemaProps()
  }

  this.`schema`.block()
}

