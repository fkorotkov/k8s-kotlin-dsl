// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamRef as v1alpha1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingSpec as v1alpha1_ValidatingAdmissionPolicyBindingSpec


fun  v1alpha1_ValidatingAdmissionPolicyBindingSpec.`paramRef`(block: v1alpha1_ParamRef.() -> Unit = {}) {
  if(this.`paramRef` == null) {
    this.`paramRef` = v1alpha1_ParamRef()
  }

  this.`paramRef`.block()
}

