// GENERATE
package com.fkorotkov.kubernetes.admissionregistration.v1alpha1

import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.MatchResources as v1alpha1_MatchResources
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.NamedRuleWithOperations as v1alpha1_NamedRuleWithOperations
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamKind as v1alpha1_ParamKind
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ParamRef as v1alpha1_ParamRef
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicy as v1alpha1_ValidatingAdmissionPolicy
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding as v1alpha1_ValidatingAdmissionPolicyBinding
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingList as v1alpha1_ValidatingAdmissionPolicyBindingList
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBindingSpec as v1alpha1_ValidatingAdmissionPolicyBindingSpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicyList as v1alpha1_ValidatingAdmissionPolicyList
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.ValidatingAdmissionPolicySpec as v1alpha1_ValidatingAdmissionPolicySpec
import io.fabric8.kubernetes.api.model.admissionregistration.v1alpha1.Validation as v1alpha1_Validation


fun newMatchResources(block : v1alpha1_MatchResources.() -> Unit = {}): v1alpha1_MatchResources {
  val instance = v1alpha1_MatchResources()
  instance.block()
  return instance
}


fun newNamedRuleWithOperations(block : v1alpha1_NamedRuleWithOperations.() -> Unit = {}): v1alpha1_NamedRuleWithOperations {
  val instance = v1alpha1_NamedRuleWithOperations()
  instance.block()
  return instance
}


fun newParamKind(block : v1alpha1_ParamKind.() -> Unit = {}): v1alpha1_ParamKind {
  val instance = v1alpha1_ParamKind()
  instance.block()
  return instance
}


fun newParamRef(block : v1alpha1_ParamRef.() -> Unit = {}): v1alpha1_ParamRef {
  val instance = v1alpha1_ParamRef()
  instance.block()
  return instance
}


fun newValidatingAdmissionPolicy(block : v1alpha1_ValidatingAdmissionPolicy.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicy {
  val instance = v1alpha1_ValidatingAdmissionPolicy()
  instance.block()
  return instance
}


fun newValidatingAdmissionPolicyBinding(block : v1alpha1_ValidatingAdmissionPolicyBinding.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyBinding {
  val instance = v1alpha1_ValidatingAdmissionPolicyBinding()
  instance.block()
  return instance
}


fun newValidatingAdmissionPolicyBindingList(block : v1alpha1_ValidatingAdmissionPolicyBindingList.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyBindingList {
  val instance = v1alpha1_ValidatingAdmissionPolicyBindingList()
  instance.block()
  return instance
}


fun newValidatingAdmissionPolicyBindingSpec(block : v1alpha1_ValidatingAdmissionPolicyBindingSpec.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyBindingSpec {
  val instance = v1alpha1_ValidatingAdmissionPolicyBindingSpec()
  instance.block()
  return instance
}


fun newValidatingAdmissionPolicyList(block : v1alpha1_ValidatingAdmissionPolicyList.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicyList {
  val instance = v1alpha1_ValidatingAdmissionPolicyList()
  instance.block()
  return instance
}


fun newValidatingAdmissionPolicySpec(block : v1alpha1_ValidatingAdmissionPolicySpec.() -> Unit = {}): v1alpha1_ValidatingAdmissionPolicySpec {
  val instance = v1alpha1_ValidatingAdmissionPolicySpec()
  instance.block()
  return instance
}


fun newValidation(block : v1alpha1_Validation.() -> Unit = {}): v1alpha1_Validation {
  val instance = v1alpha1_Validation()
  instance.block()
  return instance
}

