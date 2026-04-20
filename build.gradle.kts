plugins {
    java
    scala
    application
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
}

application {
    mainClass.set("Main")
}
