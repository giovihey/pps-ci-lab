plugins {
    java
    scala
    application
}

tasks.named<Jar>("jar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

repositories {
    mavenCentral()
}

dependencies {
    val scalaVersion = "3.7.4"
    val (scalaMinor, _) = requireNotNull(Regex("^(\\d+)(\\.\\d+)(\\.\\d+)?$").matchEntire(scalaVersion)).destructured

    compileOnly("com.github.spotbugs:spotbugs-annotations:4.9.8")
    implementation("org.scala-lang:scala3-library_3:$scalaVersion")
    implementation("com.omertron:API-OMDB:1.5")
    implementation("org.jooq:jool:0.9.15")
    implementation("org.slf4j:slf4j-api:2.0.17")
    runtimeOnly("ch.qos.logback:logback-classic:1.5.32")
    testImplementation("org.scalatest:scalatest_$scalaMinor:3.2.12")
}

application {
    mainClass.set("Main")
}
