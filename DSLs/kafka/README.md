## Usage

 ```groovy
repositories {
    maven { setUrl("https://dl.bintray.com/fkorotkov/maven") }
} 
 
dependencies {
    compile("com.fkorotkov:k8s-kafka-dsl:${kubernetes_dsl_version}")
}
```

### Using with `k8s-kafka-dsl`

Let's check out how to create list all kafka instances via [fabric8 client](https://github.com/fabric8io/kubernetes-client).
Don't forget to add a dependency on `com.fkorotkov:k8s-kafka-client:${kubernetes_dsl_version}`.

```kotlin
import DefaultKafkaClient

fun main() {
  val client = DefaultKafkaClient().inNamespace("operator")
  client.kafkaClusters().list().items.forEach { println(it) }
}
```