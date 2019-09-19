import com.fkorotkov.kubernetes.kafka.kafka
import io.fabric8.kubernetes.client.DefaultKubernetesClient


fun main() {
  val client = DefaultKubernetesClient().inNamespace("default")
  client.services()
  client.kafka().kafkaclusters().list()
}