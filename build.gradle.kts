plugins {
    id("idea")
    id("eclipse")
    id("java")
    id("maven-publish")
    id("signing")
    id("org.jreleaser") version "1.15.0"
}

repositories {
    mavenCentral()
    mavenLocal()
}

group = "io.github.pod4dev"
version = "5.5.2-1"

dependencies {
    implementation("org.hibernate.validator:hibernate-validator:8.0.1.Final")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.google.code.gson:gson:2.10")
    implementation("io.gsonfire:gson-fire:1.9.0")
    implementation("javax.ws.rs:jsr311-api:1.1")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("org.apache.commons:commons-lang3:3.15.0")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.3")
    testImplementation("org.mockito:mockito-core:5.11.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

tasks.withType<Javadoc> {
    (options as StandardJavadocDocletOptions)
            .tags("http.response.details:a:Http Response Details")
            .addStringOption("Xdoclint:none", "-quiet")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    withJavadocJar()
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])
            pom {
                packaging = "jar"
                name.set("libpod-java")
                url.set("https://github.com/pod4dev/libpod-java")
                description.set("Libpod API for Java")

                scm {
                    url.set("https://github.com/pod4dev/libpod-java")
                    connection.set("scm:git:git://github.com/pod4dev/libpod-java.git")
                    developerConnection.set("scm:git:git://github.com/pod4dev/libpod-java.git")
                }

                inceptionYear = "2025"

                developers {
                    developer {
                        name.set("Pod4Dev Team")
                    }
                }

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/license/mit")
                    }
                }
            }
        }
    }
    repositories {
        maven {
            setUrl(layout.buildDirectory.dir("staging-deploy"))
        }
    }
}

jreleaser {
    project {
        inceptionYear = "2025"
        author("Pod4Dev Team")
        description = "Libpod API for Java"
        license = "MIT"
    }
    gitRootSearch = true
    release {
        github {
            // https://github.com/jreleaser/jreleaser/discussions/367
            token = "dummy"
        }
    }
    signing {
        setActive("ALWAYS")
        armored = true
        passphrase = properties["signing.gnupg.passphrase"].toString()
        setMode("COMMAND")
        command {
            executable = properties["signing.gnupg.executable"].toString()
            keyName = properties["signing.gnupg.keyName"].toString()
        }
    }
    deploy {
        maven {
            mavenCentral {
                create("sonatype") {
                    setActive("ALWAYS")
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")
                    username.set(properties["ossrhUsername"].toString())
                    password.set(properties["ossrhPassword"].toString())
                }
            }
        }
    }
}
