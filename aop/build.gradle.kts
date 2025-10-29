plugins {
    id("io.micronaut.build.internal.convention-core-library")
    alias(libs.plugins.managed.kotlin.jvm)
}

micronautBuild {
    core {
        documented = false
    }
}

dependencies {
    api(projects.micronautInject)
    api(projects.micronautCore)
    compileOnly(projects.micronautCoreReactive)
    compileOnly(libs.managed.kotlinx.coroutines.core)
    compileOnly(libs.managed.reactor)
}

tasks {
    compileKotlin {
        kotlinOptions.languageVersion = "1.7"
        compilerOptions {
            jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21
        }
    }
}
