import com.fkorotkov.kubernetes.metadata
import com.fkorotkov.kubernetes.newServicePort
import com.fkorotkov.kubernetes.spec
import io.fabric8.kubernetes.api.model.Service

open class BaseService(val serviceName: String) : Service() {
  companion object {
    val HTTP_PORT = 8080
    val GRPC_PORT = 8239
  }

  val grpcPort = GRPC_PORT
  val httpPort = HTTP_PORT

  init {
    metadata {
      name = serviceName
      labels = Defaults.labels(serviceName)
    }
    spec {
      type = "NodePort"
      ports = listOf(
          newServicePort {
            name = "http"
            protocol = "TCP"
            port = httpPort
          },
          newServicePort {
            name = "grpc"
            port = grpcPort
          }
      )
      selector = Defaults.labels(serviceName)
    }
  }
}
