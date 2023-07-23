// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServer as v1_APIServer
import io.fabric8.openshift.api.model.config.v1.APIServerStatus as v1_APIServerStatus
import io.fabric8.openshift.api.model.config.v1.Authentication as v1_Authentication
import io.fabric8.openshift.api.model.config.v1.AuthenticationStatus as v1_AuthenticationStatus
import io.fabric8.openshift.api.model.config.v1.ClusterOperator as v1_ClusterOperator
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorStatus as v1_ClusterOperatorStatus
import io.fabric8.openshift.api.model.config.v1.ClusterVersion as v1_ClusterVersion
import io.fabric8.openshift.api.model.config.v1.ClusterVersionStatus as v1_ClusterVersionStatus
import io.fabric8.openshift.api.model.config.v1.Console as v1_Console
import io.fabric8.openshift.api.model.config.v1.ConsoleStatus as v1_ConsoleStatus
import io.fabric8.openshift.api.model.config.v1.DNS as v1_DNS
import io.fabric8.openshift.api.model.config.v1.DNSStatus as v1_DNSStatus
import io.fabric8.openshift.api.model.config.v1.FeatureGate as v1_FeatureGate
import io.fabric8.openshift.api.model.config.v1.FeatureGateStatus as v1_FeatureGateStatus
import io.fabric8.openshift.api.model.config.v1.Image as v1_Image
import io.fabric8.openshift.api.model.config.v1.ImageStatus as v1_ImageStatus
import io.fabric8.openshift.api.model.config.v1.Infrastructure as v1_Infrastructure
import io.fabric8.openshift.api.model.config.v1.InfrastructureStatus as v1_InfrastructureStatus
import io.fabric8.openshift.api.model.config.v1.Ingress as v1_Ingress
import io.fabric8.openshift.api.model.config.v1.IngressStatus as v1_IngressStatus
import io.fabric8.openshift.api.model.config.v1.Network as v1_Network
import io.fabric8.openshift.api.model.config.v1.NetworkStatus as v1_NetworkStatus
import io.fabric8.openshift.api.model.config.v1.OAuth as v1_OAuth
import io.fabric8.openshift.api.model.config.v1.OAuthStatus as v1_OAuthStatus
import io.fabric8.openshift.api.model.config.v1.OperatorHub as v1_OperatorHub
import io.fabric8.openshift.api.model.config.v1.OperatorHubStatus as v1_OperatorHubStatus
import io.fabric8.openshift.api.model.config.v1.Project as v1_Project
import io.fabric8.openshift.api.model.config.v1.ProjectStatus as v1_ProjectStatus
import io.fabric8.openshift.api.model.config.v1.Proxy as v1_Proxy
import io.fabric8.openshift.api.model.config.v1.ProxyStatus as v1_ProxyStatus
import io.fabric8.openshift.api.model.config.v1.Scheduler as v1_Scheduler
import io.fabric8.openshift.api.model.config.v1.SchedulerStatus as v1_SchedulerStatus


fun  v1_APIServer.`status`(block: v1_APIServerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_APIServerStatus()
  }

  this.`status`.block()
}


fun  v1_Authentication.`status`(block: v1_AuthenticationStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_AuthenticationStatus()
  }

  this.`status`.block()
}


fun  v1_ClusterOperator.`status`(block: v1_ClusterOperatorStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ClusterOperatorStatus()
  }

  this.`status`.block()
}


fun  v1_ClusterVersion.`status`(block: v1_ClusterVersionStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ClusterVersionStatus()
  }

  this.`status`.block()
}


fun  v1_Console.`status`(block: v1_ConsoleStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ConsoleStatus()
  }

  this.`status`.block()
}


fun  v1_DNS.`status`(block: v1_DNSStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_DNSStatus()
  }

  this.`status`.block()
}


fun  v1_FeatureGate.`status`(block: v1_FeatureGateStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_FeatureGateStatus()
  }

  this.`status`.block()
}


fun  v1_Image.`status`(block: v1_ImageStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ImageStatus()
  }

  this.`status`.block()
}


fun  v1_Infrastructure.`status`(block: v1_InfrastructureStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_InfrastructureStatus()
  }

  this.`status`.block()
}


fun  v1_Ingress.`status`(block: v1_IngressStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_IngressStatus()
  }

  this.`status`.block()
}


fun  v1_Network.`status`(block: v1_NetworkStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_NetworkStatus()
  }

  this.`status`.block()
}


fun  v1_OAuth.`status`(block: v1_OAuthStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_OAuthStatus()
  }

  this.`status`.block()
}


fun  v1_OperatorHub.`status`(block: v1_OperatorHubStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_OperatorHubStatus()
  }

  this.`status`.block()
}


fun  v1_Project.`status`(block: v1_ProjectStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ProjectStatus()
  }

  this.`status`.block()
}


fun  v1_Proxy.`status`(block: v1_ProxyStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_ProxyStatus()
  }

  this.`status`.block()
}


fun  v1_Scheduler.`status`(block: v1_SchedulerStatus.() -> Unit = {}) {
  if(this.`status` == null) {
    this.`status` = v1_SchedulerStatus()
  }

  this.`status`.block()
}

