// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.kubernetes.api.model.ListMeta as model_ListMeta
import io.fabric8.kubernetes.api.model.ObjectMeta as model_ObjectMeta
import io.fabric8.openshift.api.model.config.v1.APIServer as v1_APIServer
import io.fabric8.openshift.api.model.config.v1.APIServerList as v1_APIServerList
import io.fabric8.openshift.api.model.config.v1.Authentication as v1_Authentication
import io.fabric8.openshift.api.model.config.v1.AuthenticationList as v1_AuthenticationList
import io.fabric8.openshift.api.model.config.v1.Build as v1_Build
import io.fabric8.openshift.api.model.config.v1.BuildList as v1_BuildList
import io.fabric8.openshift.api.model.config.v1.ClusterOperator as v1_ClusterOperator
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorList as v1_ClusterOperatorList
import io.fabric8.openshift.api.model.config.v1.ClusterVersion as v1_ClusterVersion
import io.fabric8.openshift.api.model.config.v1.ClusterVersionList as v1_ClusterVersionList
import io.fabric8.openshift.api.model.config.v1.Console as v1_Console
import io.fabric8.openshift.api.model.config.v1.ConsoleList as v1_ConsoleList
import io.fabric8.openshift.api.model.config.v1.DNS as v1_DNS
import io.fabric8.openshift.api.model.config.v1.DNSList as v1_DNSList
import io.fabric8.openshift.api.model.config.v1.FeatureGate as v1_FeatureGate
import io.fabric8.openshift.api.model.config.v1.FeatureGateList as v1_FeatureGateList
import io.fabric8.openshift.api.model.config.v1.Image as v1_Image
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicy as v1_ImageContentPolicy
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicyList as v1_ImageContentPolicyList
import io.fabric8.openshift.api.model.config.v1.ImageList as v1_ImageList
import io.fabric8.openshift.api.model.config.v1.Infrastructure as v1_Infrastructure
import io.fabric8.openshift.api.model.config.v1.InfrastructureList as v1_InfrastructureList
import io.fabric8.openshift.api.model.config.v1.Ingress as v1_Ingress
import io.fabric8.openshift.api.model.config.v1.IngressList as v1_IngressList
import io.fabric8.openshift.api.model.config.v1.Network as v1_Network
import io.fabric8.openshift.api.model.config.v1.NetworkList as v1_NetworkList
import io.fabric8.openshift.api.model.config.v1.OAuth as v1_OAuth
import io.fabric8.openshift.api.model.config.v1.OAuthList as v1_OAuthList
import io.fabric8.openshift.api.model.config.v1.OperatorHub as v1_OperatorHub
import io.fabric8.openshift.api.model.config.v1.OperatorHubList as v1_OperatorHubList
import io.fabric8.openshift.api.model.config.v1.Project as v1_Project
import io.fabric8.openshift.api.model.config.v1.ProjectList as v1_ProjectList
import io.fabric8.openshift.api.model.config.v1.Proxy as v1_Proxy
import io.fabric8.openshift.api.model.config.v1.ProxyList as v1_ProxyList
import io.fabric8.openshift.api.model.config.v1.Scheduler as v1_Scheduler
import io.fabric8.openshift.api.model.config.v1.SchedulerList as v1_SchedulerList


fun  v1_APIServer.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_APIServerList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Authentication.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_AuthenticationList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Build.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_BuildList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_ClusterOperator.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ClusterOperatorList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_ClusterVersion.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ClusterVersionList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Console.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ConsoleList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_DNS.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_DNSList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_FeatureGate.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_FeatureGateList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Image.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ImageContentPolicy.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ImageContentPolicyList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_ImageList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Infrastructure.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_InfrastructureList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Ingress.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_IngressList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Network.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_NetworkList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_OAuth.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_OAuthList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_OperatorHub.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_OperatorHubList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Project.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ProjectList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Proxy.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_ProxyList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}


fun  v1_Scheduler.`metadata`(block: model_ObjectMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ObjectMeta()
  }

  this.`metadata`.block()
}


fun  v1_SchedulerList.`metadata`(block: model_ListMeta.() -> Unit = {}) {
  if(this.`metadata` == null) {
    this.`metadata` = model_ListMeta()
  }

  this.`metadata`.block()
}

