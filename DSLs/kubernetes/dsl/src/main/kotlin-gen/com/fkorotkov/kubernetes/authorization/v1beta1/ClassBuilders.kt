// GENERATE
package com.fkorotkov.kubernetes.authorization.v1beta1

import io.fabric8.kubernetes.api.model.authorization.v1beta1.LocalSubjectAccessReview as v1beta1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.NonResourceAttributes as v1beta1_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1beta1.NonResourceRule as v1beta1_NonResourceRule
import io.fabric8.kubernetes.api.model.authorization.v1beta1.ResourceAttributes as v1beta1_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1beta1.ResourceRule as v1beta1_ResourceRule
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReview as v1beta1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectAccessReviewSpec as v1beta1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReview as v1beta1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SelfSubjectRulesReviewSpec as v1beta1_SelfSubjectRulesReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReview as v1beta1_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReviewSpec as v1beta1_SubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectAccessReviewStatus as v1beta1_SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.authorization.v1beta1.SubjectRulesReviewStatus as v1beta1_SubjectRulesReviewStatus


fun newLocalSubjectAccessReview(block : v1beta1_LocalSubjectAccessReview.() -> Unit = {}): v1beta1_LocalSubjectAccessReview {
  val instance = v1beta1_LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun newNonResourceAttributes(block : v1beta1_NonResourceAttributes.() -> Unit = {}): v1beta1_NonResourceAttributes {
  val instance = v1beta1_NonResourceAttributes()
  instance.block()
  return instance
}


fun newNonResourceRule(block : v1beta1_NonResourceRule.() -> Unit = {}): v1beta1_NonResourceRule {
  val instance = v1beta1_NonResourceRule()
  instance.block()
  return instance
}


fun newResourceAttributes(block : v1beta1_ResourceAttributes.() -> Unit = {}): v1beta1_ResourceAttributes {
  val instance = v1beta1_ResourceAttributes()
  instance.block()
  return instance
}


fun newResourceRule(block : v1beta1_ResourceRule.() -> Unit = {}): v1beta1_ResourceRule {
  val instance = v1beta1_ResourceRule()
  instance.block()
  return instance
}


fun newSelfSubjectAccessReview(block : v1beta1_SelfSubjectAccessReview.() -> Unit = {}): v1beta1_SelfSubjectAccessReview {
  val instance = v1beta1_SelfSubjectAccessReview()
  instance.block()
  return instance
}


fun newSelfSubjectAccessReviewSpec(block : v1beta1_SelfSubjectAccessReviewSpec.() -> Unit = {}): v1beta1_SelfSubjectAccessReviewSpec {
  val instance = v1beta1_SelfSubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReview(block : v1beta1_SelfSubjectRulesReview.() -> Unit = {}): v1beta1_SelfSubjectRulesReview {
  val instance = v1beta1_SelfSubjectRulesReview()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReviewSpec(block : v1beta1_SelfSubjectRulesReviewSpec.() -> Unit = {}): v1beta1_SelfSubjectRulesReviewSpec {
  val instance = v1beta1_SelfSubjectRulesReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReview(block : v1beta1_SubjectAccessReview.() -> Unit = {}): v1beta1_SubjectAccessReview {
  val instance = v1beta1_SubjectAccessReview()
  instance.block()
  return instance
}


fun newSubjectAccessReviewSpec(block : v1beta1_SubjectAccessReviewSpec.() -> Unit = {}): v1beta1_SubjectAccessReviewSpec {
  val instance = v1beta1_SubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReviewStatus(block : v1beta1_SubjectAccessReviewStatus.() -> Unit = {}): v1beta1_SubjectAccessReviewStatus {
  val instance = v1beta1_SubjectAccessReviewStatus()
  instance.block()
  return instance
}


fun newSubjectRulesReviewStatus(block : v1beta1_SubjectRulesReviewStatus.() -> Unit = {}): v1beta1_SubjectRulesReviewStatus {
  val instance = v1beta1_SubjectRulesReviewStatus()
  instance.block()
  return instance
}

