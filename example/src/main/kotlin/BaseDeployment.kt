import com.fkorotkov.kubernetes.*
import com.fkorotkov.kubernetes.apps.*
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.apps.Deployment

class BaseDeployment : Deployment {
  constructor(serviceName: String) {
    metadata {
      name = "$serviceName-service-deployment"
      labels = Defaults.labels(serviceName)
    }
    spec {
      replicas = 1
      template {
        metadata {
          labels = Defaults.labels(serviceName)
        }
        spec {
          containers = listOf(
            newContainer {
              name = "$serviceName-service"
              image = "gcr.io/fkorotkov/$serviceName-service:latest"
              volumeMounts = listOf(
                newVolumeMount {
                  name = "gcp-credentials"
                  mountPath = "/etc/credentials"
                  readOnly = true
                }
              )
              env = listOf(
                newEnvVar {
                  name = "GOOGLE_APPLICATION_CREDENTIALS"
                  value = "/etc/credentials/service-account-credentials.json"
                }
              )
              ports = listOf(
                  newContainerPort {
                    name = "http"
                    containerPort = BaseService.HTTP_PORT
                    protocol = "TCP"
                  },
                  newContainerPort {
                    name = "grpc"
                    containerPort = BaseService.GRPC_PORT
                    protocol = "TCP"
                  }
              )
              livenessProbe {
                httpGet {
                  path = "/healthz"
                  port = IntOrString(BaseService.HTTP_PORT)
                }
                periodSeconds = 60
              }
              readinessProbe {
                httpGet {
                  path = "/healthz"
                  port = IntOrString(BaseService.HTTP_PORT)
                }
                initialDelaySeconds = 10
                periodSeconds = 60
              }
            }
          )
          volumes = listOf(
            newVolume {
              name = "gcp-credentials"
              secret {
                secretName = "gcp-credentials"
              }
            }
          )
        }
      }
    }
  }
}