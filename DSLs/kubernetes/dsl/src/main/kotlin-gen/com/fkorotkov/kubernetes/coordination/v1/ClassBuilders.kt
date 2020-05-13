// GENERATE
package com.fkorotkov.kubernetes.coordination.v1

import io.fabric8.kubernetes.api.model.coordination.v1.Lease as v1_Lease
import io.fabric8.kubernetes.api.model.coordination.v1.LeaseList as v1_LeaseList
import io.fabric8.kubernetes.api.model.coordination.v1.LeaseSpec as v1_LeaseSpec


fun newLease(block : v1_Lease.() -> Unit = {}): v1_Lease {
  val instance = v1_Lease()
  instance.block()
  return instance
}


fun newLeaseList(block : v1_LeaseList.() -> Unit = {}): v1_LeaseList {
  val instance = v1_LeaseList()
  instance.block()
  return instance
}


fun newLeaseSpec(block : v1_LeaseSpec.() -> Unit = {}): v1_LeaseSpec {
  val instance = v1_LeaseSpec()
  instance.block()
  return instance
}

