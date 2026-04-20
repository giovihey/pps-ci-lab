plugins {
    java
    scala
    application
    groovy
    kotlin("jvm") version "2.3.20"
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("com.github.spotbugs:spotbugs-annotations:4.9.8")
    implementation("com.omertron:API-OMDB:1.5")
    implementation("org.jooq:jool:0.9.15")
    implementation("org.slf4j:slf4j-api:2.0.17")
    runtimeOnly("ch.qos.logback:logback-classic:1.5.32")

    implementation("org.codehaus.groovy:groovy:3.0.25")
    implementation(kotlin("stdlib"))
    implementation("org.scala-lang:scala3-library_3:3.7.4")
}

application {
    mainClass.set("Main")
}
