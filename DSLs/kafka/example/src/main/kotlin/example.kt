import com.fkorotkov.kubernetes.kafka.client.DefaultKafkaClient
import com.fkorotkov.kubernetes.kafka.metadata
import com.fkorotkov.kubernetes.kafka.newKafkaCluster
import com.fkorotkov.kubernetes.kafka.spec


fun main() {
  val client = DefaultKafkaClient().inNamespace("operator")
  println(client.kafkaClusters().list())
  client.kafkaClusters().create(
      newKafkaCluster {
        metadata {
          name = "kafka"
        }
        spec {
          replicas = 3
        }
      }
  )
  println(client.kafkaClusters().list())
}