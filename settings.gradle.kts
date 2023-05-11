rootProject.name="bdd-and-tdd"

pluginManagement {
    val springBootVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings

    repositories {
        mavenCentral()
    }

    plugins {
        id("io.spring.dependency-management") version springDependencyManagementPluginVersion
        id("org.springframework.boot") version springBootVersion
    }
}
