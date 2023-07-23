// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy as v1alpha1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding as v1alpha1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingSpec as v1alpha1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicySpec as v1alpha1_ValidatingAdmissionPolicySpec


fun  v1alpha1_ValidatingAdmissionPolicy.`spec`(block: v1alpha1_ValidatingAdmissionPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1alpha1_ValidatingAdmissionPolicySpec()
  }

  this.`spec`.block()
}


fun  v1alpha1_ValidatingAdmissionPolicyBinding.`spec`(block: v1alpha1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1alpha1_ValidatingAdmissionPolicyBindingSpec()
  }

  this.`spec`.block()
}

