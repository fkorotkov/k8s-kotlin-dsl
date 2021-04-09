// GENERATE
package com.fkorotkov.kubernetes.authorization.v1

import io.fabric8.kubernetes.api.model.authorization.v1.LocalSubjectAccessReview as v1_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.NonResourceAttributes as v1_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1.NonResourceRule as v1_NonResourceRule
import io.fabric8.kubernetes.api.model.authorization.v1.ResourceAttributes as v1_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.v1.ResourceRule as v1_ResourceRule
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReview as v1_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectAccessReviewSpec as v1_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReview as v1_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.v1.SelfSubjectRulesReviewSpec as v1_SelfSubjectRulesReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReview as v1_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReviewSpec as v1_SubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectAccessReviewStatus as v1_SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.authorization.v1.SubjectRulesReviewStatus as v1_SubjectRulesReviewStatus


fun newLocalSubjectAccessReview(block : v1_LocalSubjectAccessReview.() -> Unit = {}): v1_LocalSubjectAccessReview {
  val instance = v1_LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun newNonResourceAttributes(block : v1_NonResourceAttributes.() -> Unit = {}): v1_NonResourceAttributes {
  val instance = v1_NonResourceAttributes()
  instance.block()
  return instance
}


fun newNonResourceRule(block : v1_NonResourceRule.() -> Unit = {}): v1_NonResourceRule {
  val instance = v1_NonResourceRule()
  instance.block()
  return instance
}


fun newResourceAttributes(block : v1_ResourceAttributes.() -> Unit = {}): v1_ResourceAttributes {
  val instance = v1_ResourceAttributes()
  instance.block()
  return instance
}


fun newResourceRule(block : v1_ResourceRule.() -> Unit = {}): v1_ResourceRule {
  val instance = v1_ResourceRule()
  instance.block()
  return instance
}


fun newSelfSubjectAccessReview(block : v1_SelfSubjectAccessReview.() -> Unit = {}): v1_SelfSubjectAccessReview {
  val instance = v1_SelfSubjectAccessReview()
  instance.block()
  return instance
}


fun newSelfSubjectAccessReviewSpec(block : v1_SelfSubjectAccessReviewSpec.() -> Unit = {}): v1_SelfSubjectAccessReviewSpec {
  val instance = v1_SelfSubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReview(block : v1_SelfSubjectRulesReview.() -> Unit = {}): v1_SelfSubjectRulesReview {
  val instance = v1_SelfSubjectRulesReview()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReviewSpec(block : v1_SelfSubjectRulesReviewSpec.() -> Unit = {}): v1_SelfSubjectRulesReviewSpec {
  val instance = v1_SelfSubjectRulesReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReview(block : v1_SubjectAccessReview.() -> Unit = {}): v1_SubjectAccessReview {
  val instance = v1_SubjectAccessReview()
  instance.block()
  return instance
}


fun newSubjectAccessReviewSpec(block : v1_SubjectAccessReviewSpec.() -> Unit = {}): v1_SubjectAccessReviewSpec {
  val instance = v1_SubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReviewStatus(block : v1_SubjectAccessReviewStatus.() -> Unit = {}): v1_SubjectAccessReviewStatus {
  val instance = v1_SubjectAccessReviewStatus()
  instance.block()
  return instance
}


fun newSubjectRulesReviewStatus(block : v1_SubjectRulesReviewStatus.() -> Unit = {}): v1_SubjectRulesReviewStatus {
  val instance = v1_SubjectRulesReviewStatus()
  instance.block()
  return instance
}

