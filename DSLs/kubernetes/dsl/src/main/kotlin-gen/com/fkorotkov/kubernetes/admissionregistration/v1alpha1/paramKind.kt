// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamKind as v1alpha1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicySpec as v1alpha1_ValidatingAdmissionPolicySpec


fun  v1alpha1_ValidatingAdmissionPolicySpec.`paramKind`(block: v1alpha1_ParamKind.() -> Unit = {}) {
  if(this.`paramKind` == null) {
    this.`paramKind` = v1alpha1_ParamKind()
  }

  this.`paramKind`.block()
}

