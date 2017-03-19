A simple generator that uses reflections to generate DSL for building any kind of objects. 


1. For a given class `Foo` it will generate object initializer:
    ```kotlin
    fun foo(block : Foo.() -> Unit = {}): Foo {
      val instance = HostPathVolumeSource()
      instance.block()
      return instance
    }
    ```
2. For every non primitive member `bar` of the given class `Foo` the following extension function will be generated:

   ```kotlin
    fun  Foo.`bar`(block: Bar.() -> Unit = {}) {
      if(this.`bar` == null) {
        this.`bar` = Bar()
      }
    
      this.`bar`.block()
    }
    ```

