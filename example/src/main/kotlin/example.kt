import com.fkorotkov.kubernetes.extensions.*
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.client.DefaultKubernetesClient


fun main() {
  val client = DefaultKubernetesClient().inNamespace("default")
  client.extensions().ingresses().createOrReplace(
    newIngress {
      metadata {
        name = "example-ingress"
      }
      spec {
        backend {
          serviceName = "example-service"
          servicePort = IntOrString(8080)
        }
      }
    }
  )
}