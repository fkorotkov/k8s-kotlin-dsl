import com.fkorotkov.kubernetes.client.DefaultKafkaClient
import com.fkorotkov.kubernetes.kafka.*


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