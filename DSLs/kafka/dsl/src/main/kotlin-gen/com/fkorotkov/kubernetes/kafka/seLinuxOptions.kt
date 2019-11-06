// GENERATED
package com.fkorotkov.kubernetes.kafka

import com.fkorotkov.kubernetes.kafka.PodSecurityContext as kafka_PodSecurityContext
import com.fkorotkov.kubernetes.kafka.SeLinuxOptions as kafka_SeLinuxOptions


fun  kafka_PodSecurityContext.`seLinuxOptions`(block: kafka_SeLinuxOptions.() -> Unit = {}) {
  if(this.`seLinuxOptions` == null) {
    this.`seLinuxOptions` = kafka_SeLinuxOptions()
  }

  this.`seLinuxOptions`.block()
}

