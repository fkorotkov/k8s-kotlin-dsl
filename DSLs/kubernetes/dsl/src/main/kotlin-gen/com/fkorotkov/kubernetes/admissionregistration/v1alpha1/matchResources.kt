// GENERATED
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingSpec as v1alpha1_ValidatingAdmissionPolicyBindingSpec


fun  v1alpha1_ValidatingAdmissionPolicyBindingSpec.`matchResources`(block: v1alpha1_MatchResources.() -> Unit = {}) {
  if(this.`matchResources` == null) {
    this.`matchResources` = v1alpha1_MatchResources()
  }

  this.`matchResources`.block()
}

