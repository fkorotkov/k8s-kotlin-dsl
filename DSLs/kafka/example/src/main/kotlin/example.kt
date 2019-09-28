import com.fkorotkov.kubernetes.kafka.client.DefaultKafkaClient
import com.fkorotkov.kubernetes.kafka.metadata
import com.fkorotkov.kubernetes.kafka.newKafkaCluster
import com.fkorotkov.kubernetes.kafka.spec


fun main() {
  val client = DefaultKafkaClient().inNamespace("operator")
  client.kafkaClusters().list().items.forEach { println(it) }
}