// GENERATED
package com.fkorotkov.openshift.config.v1

import io.fabric8.openshift.api.model.config.v1.APIServer as v1_APIServer
import io.fabric8.openshift.api.model.config.v1.APIServerSpec as v1_APIServerSpec
import io.fabric8.openshift.api.model.config.v1.Authentication as v1_Authentication
import io.fabric8.openshift.api.model.config.v1.AuthenticationSpec as v1_AuthenticationSpec
import io.fabric8.openshift.api.model.config.v1.Build as v1_Build
import io.fabric8.openshift.api.model.config.v1.BuildSpec as v1_BuildSpec
import io.fabric8.openshift.api.model.config.v1.ClusterOperator as v1_ClusterOperator
import io.fabric8.openshift.api.model.config.v1.ClusterOperatorSpec as v1_ClusterOperatorSpec
import io.fabric8.openshift.api.model.config.v1.ClusterVersion as v1_ClusterVersion
import io.fabric8.openshift.api.model.config.v1.ClusterVersionSpec as v1_ClusterVersionSpec
import io.fabric8.openshift.api.model.config.v1.Console as v1_Console
import io.fabric8.openshift.api.model.config.v1.ConsoleSpec as v1_ConsoleSpec
import io.fabric8.openshift.api.model.config.v1.DNS as v1_DNS
import io.fabric8.openshift.api.model.config.v1.DNSSpec as v1_DNSSpec
import io.fabric8.openshift.api.model.config.v1.FeatureGate as v1_FeatureGate
import io.fabric8.openshift.api.model.config.v1.FeatureGateSpec as v1_FeatureGateSpec
import io.fabric8.openshift.api.model.config.v1.Image as v1_Image
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicy as v1_ImageContentPolicy
import io.fabric8.openshift.api.model.config.v1.ImageContentPolicySpec as v1_ImageContentPolicySpec
import io.fabric8.openshift.api.model.config.v1.ImageSpec as v1_ImageSpec
import io.fabric8.openshift.api.model.config.v1.Infrastructure as v1_Infrastructure
import io.fabric8.openshift.api.model.config.v1.InfrastructureSpec as v1_InfrastructureSpec
import io.fabric8.openshift.api.model.config.v1.Ingress as v1_Ingress
import io.fabric8.openshift.api.model.config.v1.IngressSpec as v1_IngressSpec
import io.fabric8.openshift.api.model.config.v1.Network as v1_Network
import io.fabric8.openshift.api.model.config.v1.NetworkSpec as v1_NetworkSpec
import io.fabric8.openshift.api.model.config.v1.OAuth as v1_OAuth
import io.fabric8.openshift.api.model.config.v1.OAuthSpec as v1_OAuthSpec
import io.fabric8.openshift.api.model.config.v1.OperatorHub as v1_OperatorHub
import io.fabric8.openshift.api.model.config.v1.OperatorHubSpec as v1_OperatorHubSpec
import io.fabric8.openshift.api.model.config.v1.Project as v1_Project
import io.fabric8.openshift.api.model.config.v1.ProjectSpec as v1_ProjectSpec
import io.fabric8.openshift.api.model.config.v1.Proxy as v1_Proxy
import io.fabric8.openshift.api.model.config.v1.ProxySpec as v1_ProxySpec
import io.fabric8.openshift.api.model.config.v1.Scheduler as v1_Scheduler
import io.fabric8.openshift.api.model.config.v1.SchedulerSpec as v1_SchedulerSpec


fun  v1_APIServer.`spec`(block: v1_APIServerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_APIServerSpec()
  }

  this.`spec`.block()
}


fun  v1_Authentication.`spec`(block: v1_AuthenticationSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_AuthenticationSpec()
  }

  this.`spec`.block()
}


fun  v1_Build.`spec`(block: v1_BuildSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_BuildSpec()
  }

  this.`spec`.block()
}


fun  v1_ClusterOperator.`spec`(block: v1_ClusterOperatorSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ClusterOperatorSpec()
  }

  this.`spec`.block()
}


fun  v1_ClusterVersion.`spec`(block: v1_ClusterVersionSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ClusterVersionSpec()
  }

  this.`spec`.block()
}


fun  v1_Console.`spec`(block: v1_ConsoleSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ConsoleSpec()
  }

  this.`spec`.block()
}


fun  v1_DNS.`spec`(block: v1_DNSSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_DNSSpec()
  }

  this.`spec`.block()
}


fun  v1_FeatureGate.`spec`(block: v1_FeatureGateSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_FeatureGateSpec()
  }

  this.`spec`.block()
}


fun  v1_Image.`spec`(block: v1_ImageSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ImageSpec()
  }

  this.`spec`.block()
}


fun  v1_ImageContentPolicy.`spec`(block: v1_ImageContentPolicySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ImageContentPolicySpec()
  }

  this.`spec`.block()
}


fun  v1_Infrastructure.`spec`(block: v1_InfrastructureSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_InfrastructureSpec()
  }

  this.`spec`.block()
}


fun  v1_Ingress.`spec`(block: v1_IngressSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_IngressSpec()
  }

  this.`spec`.block()
}


fun  v1_Network.`spec`(block: v1_NetworkSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_NetworkSpec()
  }

  this.`spec`.block()
}


fun  v1_OAuth.`spec`(block: v1_OAuthSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_OAuthSpec()
  }

  this.`spec`.block()
}


fun  v1_OperatorHub.`spec`(block: v1_OperatorHubSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_OperatorHubSpec()
  }

  this.`spec`.block()
}


fun  v1_Project.`spec`(block: v1_ProjectSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ProjectSpec()
  }

  this.`spec`.block()
}


fun  v1_Proxy.`spec`(block: v1_ProxySpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_ProxySpec()
  }

  this.`spec`.block()
}


fun  v1_Scheduler.`spec`(block: v1_SchedulerSpec.() -> Unit = {}) {
  if(this.`spec` == null) {
    this.`spec` = v1_SchedulerSpec()
  }

  this.`spec`.block()
}

