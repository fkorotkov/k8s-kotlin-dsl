// GENERATE
package com.fkorotkov.kubernetes.authorization

import io.fabric8.kubernetes.api.model.authorization.LocalSubjectAccessReview as authorization_LocalSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.NonResourceAttributes as authorization_NonResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.NonResourceRule as authorization_NonResourceRule
import io.fabric8.kubernetes.api.model.authorization.ResourceAttributes as authorization_ResourceAttributes
import io.fabric8.kubernetes.api.model.authorization.ResourceRule as authorization_ResourceRule
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectAccessReview as authorization_SelfSubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectAccessReviewSpec as authorization_SelfSubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectRulesReview as authorization_SelfSubjectRulesReview
import io.fabric8.kubernetes.api.model.authorization.SelfSubjectRulesReviewSpec as authorization_SelfSubjectRulesReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReview as authorization_SubjectAccessReview
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec as authorization_SubjectAccessReviewSpec
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewStatus as authorization_SubjectAccessReviewStatus
import io.fabric8.kubernetes.api.model.authorization.SubjectRulesReviewStatus as authorization_SubjectRulesReviewStatus


fun newLocalSubjectAccessReview(block : authorization_LocalSubjectAccessReview.() -> Unit = {}): authorization_LocalSubjectAccessReview {
  val instance = authorization_LocalSubjectAccessReview()
  instance.block()
  return instance
}


fun newNonResourceAttributes(block : authorization_NonResourceAttributes.() -> Unit = {}): authorization_NonResourceAttributes {
  val instance = authorization_NonResourceAttributes()
  instance.block()
  return instance
}


fun newNonResourceRule(block : authorization_NonResourceRule.() -> Unit = {}): authorization_NonResourceRule {
  val instance = authorization_NonResourceRule()
  instance.block()
  return instance
}


fun newResourceAttributes(block : authorization_ResourceAttributes.() -> Unit = {}): authorization_ResourceAttributes {
  val instance = authorization_ResourceAttributes()
  instance.block()
  return instance
}


fun newResourceRule(block : authorization_ResourceRule.() -> Unit = {}): authorization_ResourceRule {
  val instance = authorization_ResourceRule()
  instance.block()
  return instance
}


fun newSelfSubjectAccessReview(block : authorization_SelfSubjectAccessReview.() -> Unit = {}): authorization_SelfSubjectAccessReview {
  val instance = authorization_SelfSubjectAccessReview()
  instance.block()
  return instance
}


fun newSelfSubjectAccessReviewSpec(block : authorization_SelfSubjectAccessReviewSpec.() -> Unit = {}): authorization_SelfSubjectAccessReviewSpec {
  val instance = authorization_SelfSubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReview(block : authorization_SelfSubjectRulesReview.() -> Unit = {}): authorization_SelfSubjectRulesReview {
  val instance = authorization_SelfSubjectRulesReview()
  instance.block()
  return instance
}


fun newSelfSubjectRulesReviewSpec(block : authorization_SelfSubjectRulesReviewSpec.() -> Unit = {}): authorization_SelfSubjectRulesReviewSpec {
  val instance = authorization_SelfSubjectRulesReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReview(block : authorization_SubjectAccessReview.() -> Unit = {}): authorization_SubjectAccessReview {
  val instance = authorization_SubjectAccessReview()
  instance.block()
  return instance
}


fun newSubjectAccessReviewSpec(block : authorization_SubjectAccessReviewSpec.() -> Unit = {}): authorization_SubjectAccessReviewSpec {
  val instance = authorization_SubjectAccessReviewSpec()
  instance.block()
  return instance
}


fun newSubjectAccessReviewStatus(block : authorization_SubjectAccessReviewStatus.() -> Unit = {}): authorization_SubjectAccessReviewStatus {
  val instance = authorization_SubjectAccessReviewStatus()
  instance.block()
  return instance
}


fun newSubjectRulesReviewStatus(block : authorization_SubjectRulesReviewStatus.() -> Unit = {}): authorization_SubjectRulesReviewStatus {
  val instance = authorization_SubjectRulesReviewStatus()
  instance.block()
  return instance
}

