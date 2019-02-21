import com.fkorotkov.kubernetes.*
import com.fkorotkov.kubernetes.apps.*
import io.fabric8.kubernetes.api.model.IntOrString
import io.fabric8.kubernetes.api.model.apps.Deployment

class BaseDeployment : Deployment {
  constructor(serviceName: String) {
    metadata {
      name = "$serviceName-service-deployment"
      labels = mapOf(
        "app" to serviceName,
        "tier" to "backend"
      )
    }
    spec {
      replicas = 1
      template {
        metadata {
          labels = mapOf(
            "app" to serviceName,
            "tier" to "backend"
          )
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
                  containerPort = 8080
                }
              )
              livenessProbe {
                httpGet {
                  path = "/healthz"
                  port = IntOrString(8080)
                }
                periodSeconds = 60
              }
              readinessProbe {
                httpGet {
                  path = "/healthz"
                  port = IntOrString(8080)
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