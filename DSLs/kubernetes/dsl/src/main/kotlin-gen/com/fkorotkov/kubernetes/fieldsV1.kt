// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FieldsV1 as model_FieldsV1
import io.fabric8.kubernetes.api.model.ManagedFieldsEntry as model_ManagedFieldsEntry


fun  model_ManagedFieldsEntry.`fieldsV1`(block: model_FieldsV1.() -> Unit = {}) {
  if(this.`fieldsV1` == null) {
    this.`fieldsV1` = model_FieldsV1()
  }

  this.`fieldsV1`.block()
}

