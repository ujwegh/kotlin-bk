plugins {
    base
    kotlin("jvm") version "1.3.61"
}

allprojects {
    group = "ru.nik"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.google.guava:guava:23.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}
