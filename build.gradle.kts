plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.eclipse.jetty:jetty-server:9.3.0.M1")
    implementation("org.eclipse.jetty:jetty-webapp:9.3.0.M0")
    implementation("org.freemarker:freemarker:2.3.20")
    implementation("org.apache.logging.log4j:log4j:2.17.1")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}