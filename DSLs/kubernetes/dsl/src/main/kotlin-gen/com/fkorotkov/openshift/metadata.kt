// GENERATED
package com.fkorotkov.openshift

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.openshift.api.model.AppliedClusterResourceQuota as model_AppliedClusterResourceQuota
import io.fabric8.openshift.api.model.AppliedClusterResourceQuotaList as model_AppliedClusterResourceQuotaList
import io.fabric8.openshift.api.model.BrokerTemplateInstance as model_BrokerTemplateInstance
import io.fabric8.openshift.api.model.BrokerTemplateInstanceList as model_BrokerTemplateInstanceList
import io.fabric8.openshift.api.model.Build as model_Build
import io.fabric8.openshift.api.model.BuildConfig as model_BuildConfig
import io.fabric8.openshift.api.model.BuildConfigList as model_BuildConfigList
import io.fabric8.openshift.api.model.BuildList as model_BuildList
import io.fabric8.openshift.api.model.BuildRequest as model_BuildRequest
import io.fabric8.openshift.api.model.ClusterNetwork as model_ClusterNetwork
import io.fabric8.openshift.api.model.ClusterNetworkList as model_ClusterNetworkList
import io.fabric8.openshift.api.model.ClusterResourceQuota as model_ClusterResourceQuota
import io.fabric8.openshift.api.model.ClusterResourceQuotaList as model_ClusterResourceQuotaList
import io.fabric8.openshift.api.model.ClusterRole as model_ClusterRole
import io.fabric8.openshift.api.model.ClusterRoleBinding as model_ClusterRoleBinding
import io.fabric8.openshift.api.model.ClusterRoleBindingList as model_ClusterRoleBindingList
import io.fabric8.openshift.api.model.ClusterRoleList as model_ClusterRoleList
import io.fabric8.openshift.api.model.DeploymentConfig as model_DeploymentConfig
import io.fabric8.openshift.api.model.DeploymentConfigList as model_DeploymentConfigList
import io.fabric8.openshift.api.model.EgressNetworkPolicy as model_EgressNetworkPolicy
import io.fabric8.openshift.api.model.EgressNetworkPolicyList as model_EgressNetworkPolicyList
import io.fabric8.openshift.api.model.Group as model_Group
import io.fabric8.openshift.api.model.GroupList as model_GroupList
import io.fabric8.openshift.api.model.HelmChartRepository as model_HelmChartRepository
import io.fabric8.openshift.api.model.HelmChartRepositoryList as model_HelmChartRepositoryList
import io.fabric8.openshift.api.model.HostSubnet as model_HostSubnet
import io.fabric8.openshift.api.model.HostSubnetList as model_HostSubnetList
import io.fabric8.openshift.api.model.Identity as model_Identity
import io.fabric8.openshift.api.model.IdentityList as model_IdentityList
import io.fabric8.openshift.api.model.Image as model_Image
import io.fabric8.openshift.api.model.ImageList as model_ImageList
import io.fabric8.openshift.api.model.ImageSignature as model_ImageSignature
import io.fabric8.openshift.api.model.ImageStream as model_ImageStream
import io.fabric8.openshift.api.model.ImageStreamImage as model_ImageStreamImage
import io.fabric8.openshift.api.model.ImageStreamImport as model_ImageStreamImport
import io.fabric8.openshift.api.model.ImageStreamList as model_ImageStreamList
import io.fabric8.openshift.api.model.ImageStreamMapping as model_ImageStreamMapping
import io.fabric8.openshift.api.model.ImageStreamTag as model_ImageStreamTag
import io.fabric8.openshift.api.model.ImageStreamTagList as model_ImageStreamTagList
import io.fabric8.openshift.api.model.ImageTag as model_ImageTag
import io.fabric8.openshift.api.model.ImageTagList as model_ImageTagList
import io.fabric8.openshift.api.model.NetNamespace as model_NetNamespace
import io.fabric8.openshift.api.model.NetNamespaceList as model_NetNamespaceList
import io.fabric8.openshift.api.model.OAuthAccessToken as model_OAuthAccessToken
import io.fabric8.openshift.api.model.OAuthAccessTokenList as model_OAuthAccessTokenList
import io.fabric8.openshift.api.model.OAuthAuthorizeToken as model_OAuthAuthorizeToken
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList as model_OAuthAuthorizeTokenList
import io.fabric8.openshift.api.model.OAuthClient as model_OAuthClient
import io.fabric8.openshift.api.model.OAuthClientAuthorization as model_OAuthClientAuthorization
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList as model_OAuthClientAuthorizationList
import io.fabric8.openshift.api.model.OAuthClientList as model_OAuthClientList
import io.fabric8.openshift.api.model.Project as model_Project
import io.fabric8.openshift.api.model.ProjectList as model_ProjectList
import io.fabric8.openshift.api.model.ProjectRequest as model_ProjectRequest
import io.fabric8.openshift.api.model.RangeAllocation as model_RangeAllocation
import io.fabric8.openshift.api.model.RangeAllocationList as model_RangeAllocationList
import io.fabric8.openshift.api.model.Role as model_Role
import io.fabric8.openshift.api.model.RoleBinding as model_RoleBinding
import io.fabric8.openshift.api.model.RoleBindingList as model_RoleBindingList
import io.fabric8.openshift.api.model.RoleBindingRestriction as model_RoleBindingRestriction
import io.fabric8.openshift.api.model.RoleBindingRestrictionList as model_RoleBindingRestrictionList
import io.fabric8.openshift.api.model.RoleList as model_RoleList
import io.fabric8.openshift.api.model.Route as model_Route
import io.fabric8.openshift.api.model.RouteList as model_RouteList
import io.fabric8.openshift.api.model.SecurityContextConstraints as model_SecurityContextConstraints
import io.fabric8.openshift.api.model.SecurityContextConstraintsList as model_SecurityContextConstraintsList
import io.fabric8.openshift.api.model.Template as model_Template
import io.fabric8.openshift.api.model.TemplateInstance as model_TemplateInstance
import io.fabric8.openshift.api.model.TemplateInstanceList as model_TemplateInstanceList
import io.fabric8.openshift.api.model.TemplateList as model_TemplateList
import io.fabric8.openshift.api.model.User as model_User
import io.fabric8.openshift.api.model.UserIdentityMapping as model_UserIdentityMapping
import io.fabric8.openshift.api.model.UserList as model_UserList
import io.fabric8.openshift.api.model.UserOAuthAccessToken as model_UserOAuthAccessToken
import io.fabric8.openshift.api.model.UserOAuthAccessTokenList as model_UserOAuthAccessTokenList


fun  model_AppliedClusterResourceQuota.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_AppliedClusterResourceQuotaList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_BrokerTemplateInstance.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_BrokerTemplateInstanceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Build.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_BuildConfig.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_BuildConfigList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_BuildList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_BuildRequest.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterNetwork.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterNetworkList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterResourceQuota.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterResourceQuotaList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterRole.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterRoleBinding.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterRoleBindingList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ClusterRoleList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_DeploymentConfig.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_DeploymentConfigList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_EgressNetworkPolicy.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_EgressNetworkPolicyList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Group.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_GroupList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_HelmChartRepository.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_HelmChartRepositoryList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_HostSubnet.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_HostSubnetList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Identity.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_IdentityList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Image.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageSignature.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStream.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStreamImage.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStreamImport.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStreamList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStreamMapping.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStreamTag.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageStreamTagList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageTag.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ImageTagList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_NetNamespace.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_NetNamespaceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthAccessToken.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthAccessTokenList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthAuthorizeToken.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthAuthorizeTokenList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthClient.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthClientAuthorization.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthClientAuthorizationList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_OAuthClientList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Project.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_ProjectList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_ProjectRequest.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_RangeAllocation.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_RangeAllocationList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Role.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_RoleBinding.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_RoleBindingList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_RoleBindingRestriction.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_RoleBindingRestrictionList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_RoleList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Route.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_RouteList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_SecurityContextConstraints.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_SecurityContextConstraintsList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_Template.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_TemplateInstance.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_TemplateInstanceList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_TemplateList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_User.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_UserIdentityMapping.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_UserList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  model_UserOAuthAccessToken.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  model_UserOAuthAccessTokenList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

