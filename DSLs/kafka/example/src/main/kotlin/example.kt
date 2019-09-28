import com.fkorotkov.kubernetes.kafka.client.DefaultKafkaClient


fun main() {
  val client = DefaultKafkaClient().inNamespace("default")
  client.kafkaClusters().list()
}