// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta
import io.fabric8.openshift.api.model.Build
import io.fabric8.openshift.api.model.BuildConfig
import io.fabric8.openshift.api.model.BuildConfigList
import io.fabric8.openshift.api.model.BuildList
import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.ClusterPolicy
import io.fabric8.openshift.api.model.ClusterPolicyBinding
import io.fabric8.openshift.api.model.ClusterPolicyBindingList
import io.fabric8.openshift.api.model.ClusterPolicyList
import io.fabric8.openshift.api.model.ClusterRole
import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.ClusterRoleBindingList
import io.fabric8.openshift.api.model.DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigList
import io.fabric8.openshift.api.model.Group
import io.fabric8.openshift.api.model.GroupList
import io.fabric8.openshift.api.model.Identity
import io.fabric8.openshift.api.model.IdentityList
import io.fabric8.openshift.api.model.Image
import io.fabric8.openshift.api.model.ImageList
import io.fabric8.openshift.api.model.ImageSignature
import io.fabric8.openshift.api.model.ImageStream
import io.fabric8.openshift.api.model.ImageStreamList
import io.fabric8.openshift.api.model.ImageStreamTag
import io.fabric8.openshift.api.model.ImageStreamTagList
import io.fabric8.openshift.api.model.NetNamespace
import io.fabric8.openshift.api.model.NetNamespaceList
import io.fabric8.openshift.api.model.OAuthAccessToken
import io.fabric8.openshift.api.model.OAuthAccessTokenList
import io.fabric8.openshift.api.model.OAuthAuthorizeToken
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList
import io.fabric8.openshift.api.model.OAuthClient
import io.fabric8.openshift.api.model.OAuthClientAuthorization
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList
import io.fabric8.openshift.api.model.OAuthClientList
import io.fabric8.openshift.api.model.Policy
import io.fabric8.openshift.api.model.PolicyBinding
import io.fabric8.openshift.api.model.PolicyBindingList
import io.fabric8.openshift.api.model.PolicyList
import io.fabric8.openshift.api.model.Project
import io.fabric8.openshift.api.model.ProjectList
import io.fabric8.openshift.api.model.ProjectRequest
import io.fabric8.openshift.api.model.Role
import io.fabric8.openshift.api.model.RoleBinding
import io.fabric8.openshift.api.model.RoleBindingList
import io.fabric8.openshift.api.model.RoleBindingRestriction
import io.fabric8.openshift.api.model.RoleList
import io.fabric8.openshift.api.model.Route
import io.fabric8.openshift.api.model.RouteList
import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.SecurityContextConstraintsList
import io.fabric8.openshift.api.model.Template
import io.fabric8.openshift.api.model.TemplateList
import io.fabric8.openshift.api.model.User
import io.fabric8.openshift.api.model.UserList


fun  Build.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  BuildConfig.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  BuildConfigList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  BuildList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  BuildRequest.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ClusterPolicy.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ClusterPolicyBinding.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ClusterPolicyBindingList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ClusterPolicyList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ClusterRole.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ClusterRoleBinding.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ClusterRoleBindingList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  DeploymentConfig.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  DeploymentConfigList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Group.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  GroupList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Identity.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  IdentityList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Image.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ImageList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ImageSignature.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ImageStream.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ImageStreamList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ImageStreamTag.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ImageStreamTagList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  NetNamespace.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  NetNamespaceList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  OAuthAccessToken.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  OAuthAccessTokenList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  OAuthAuthorizeToken.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  OAuthAuthorizeTokenList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  OAuthClient.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  OAuthClientAuthorization.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  OAuthClientAuthorizationList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  OAuthClientList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Policy.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  PolicyBinding.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  PolicyBindingList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  PolicyList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Project.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  ProjectList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  ProjectRequest.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  Role.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  RoleBinding.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  RoleBindingList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  RoleBindingRestriction.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  RoleList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Route.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  RouteList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  SecurityContextConstraints.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  SecurityContextConstraintsList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  Template.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  TemplateList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}


fun  User.`metadata`(block: ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ObjectMeta()
  }

  this.`metadata`.block()
}


fun  UserList.`metadata`(block: ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = ListMeta()
  }

  this.`metadata`.block()
}

