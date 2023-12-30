plugins {
    id("groovy")
}

group = "com.issenn.jenkins-config"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "Jenkins Repository"
        url = uri("https://repo.jenkins-ci.org/public/")
    }
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.4.21")
    implementation("org.jenkins-ci.main:jenkins-core:2.277.4")
}

sourceSets {
    main {
        groovy.srcDir("jenkins/ref/init.groovy.d")
    }
}
