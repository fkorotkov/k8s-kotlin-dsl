// GENERATE
package com.fkorotkov.kubernetes.coordination.v1beta1

import io.fabric8.kubernetes.api.model.coordination.v1beta1.Lease as v1beta1_Lease
import io.fabric8.kubernetes.api.model.coordination.v1beta1.LeaseList as v1beta1_LeaseList
import io.fabric8.kubernetes.api.model.coordination.v1beta1.LeaseSpec as v1beta1_LeaseSpec


fun newLease(block : v1beta1_Lease.() -> Unit = {}): v1beta1_Lease {
  val instance = v1beta1_Lease()
  instance.block()
  return instance
}


fun newLeaseList(block : v1beta1_LeaseList.() -> Unit = {}): v1beta1_LeaseList {
  val instance = v1beta1_LeaseList()
  instance.block()
  return instance
}


fun newLeaseSpec(block : v1beta1_LeaseSpec.() -> Unit = {}): v1beta1_LeaseSpec {
  val instance = v1beta1_LeaseSpec()
  instance.block()
  return instance
}

