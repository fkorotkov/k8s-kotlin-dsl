import com.fkorotkov.kubernetes.client.DefaultZookeeperClient


fun main() {
  val client = DefaultZookeeperClient().inNamespace("operator")
  println(client.zookeeperClusters().list())
}