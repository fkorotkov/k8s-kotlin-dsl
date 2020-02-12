
object Defaults {
  fun labels(serviceName: String) =
      mapOf(
          "app" to serviceName,
          "tier" to "backend"
      )
}