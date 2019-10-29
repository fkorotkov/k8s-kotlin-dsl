import com.google.common.io.Resources
import com.google.gson.GsonBuilder
import org.junit.Test
import java.nio.charset.Charset
import kotlin.test.assertEquals

class BaseDeploymentTest {
  @Test
  fun testSimpleContainerTemplate() {
    val gson = GsonBuilder()
        .setPrettyPrinting()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
        .create()
    val expected = Resources.toString(Resources.getResource("deployment.json"), Charset.defaultCharset())
    assertEquals(expected.trim(), gson.toJson(BaseDeployment("foo")).trim())
  }
}