import io.fabric8.kubernetes.client.DefaultKubernetesClient


fun main() {
  val client = DefaultKubernetesClient().inNamespace("default")
  client.services()
}