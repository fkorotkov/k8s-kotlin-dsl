## Usage

 ```groovy
repositories {
    maven { setUrl("https://dl.bintray.com/fkorotkov/maven") }
} 
 
dependencies {
    compile("com.fkorotkov:k8s-zookeeper-dsl:${kubernetes_dsl_version}")
}
```

### Using with `k8s-zookeeper-dsl`

Let's check out how to create list all zookeeper instances via [fabric8 client](https://github.com/fabric8io/kubernetes-client).
Don't forget to add a dependency on `com.fkorotkov:k8s-zookeeper-client:${kubernetes_dsl_version}`.

```kotlin
import DefaultZookeeperClient

fun main() {
  val client = DefaultZookeeperClient().inNamespace("operator")
  client.zookeeperClusters().list().items.forEach { println(it) }
}
```