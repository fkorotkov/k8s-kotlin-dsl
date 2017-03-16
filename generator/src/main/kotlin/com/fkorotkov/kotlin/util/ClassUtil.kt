package com.fkorotkov.kotlin.util

import com.google.common.reflect.ClassPath
import kotlin.reflect.KClass

object ClassUtil {
  fun findAllClassesOnClasspath(): Collection<KClass<*>> {
    return ClassPath.from(this::class.java.classLoader).allClasses.mapNotNull {
      try {
        it.load().kotlin
      } catch (e: Throwable) {
        null
      }
    }
  }
}