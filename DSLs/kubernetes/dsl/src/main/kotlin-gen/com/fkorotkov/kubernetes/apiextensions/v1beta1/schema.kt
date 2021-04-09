// GENERATED
package com.fkorotkov.kubernetes.apiextensions.v1beta1

import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceDefinitionVersion as v1beta1_CustomResourceDefinitionVersion
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.CustomResourceValidation as v1beta1_CustomResourceValidation
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaProps as v1beta1_JSONSchemaProps
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaPropsOrArray as v1beta1_JSONSchemaPropsOrArray
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaPropsOrBool as v1beta1_JSONSchemaPropsOrBool
import io.fabric8.kubernetes.api.model.apiextensions.v1beta1.JSONSchemaPropsOrStringArray as v1beta1_JSONSchemaPropsOrStringArray


fun  v1beta1_CustomResourceDefinitionVersion.`schema`(block: v1beta1_CustomResourceValidation.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1beta1_CustomResourceValidation()
  }

  this.`schema`.block()
}


fun  v1beta1_JSONSchemaPropsOrArray.`schema`(block: v1beta1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1beta1_JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  v1beta1_JSONSchemaPropsOrBool.`schema`(block: v1beta1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1beta1_JSONSchemaProps()
  }

  this.`schema`.block()
}


fun  v1beta1_JSONSchemaPropsOrStringArray.`schema`(block: v1beta1_JSONSchemaProps.() -> Unit = {}) {
  if(this.`schema` == null) {
    this.`schema` = v1beta1_JSONSchemaProps()
  }

  this.`schema`.block()
}

