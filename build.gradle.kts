plugins {
    groovy
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
    implementation(group = "org.jenkins-ci.main", name = "jenkins-core", version = "2.277.4", ext = "jar")
}

sourceSets {
    main {
        java {
            setSrcDirs(emptyList<String>())
        }
        groovy {
            setSrcDirs(emptyList<String>())
            setSrcDirs(listOf("jenkins/ref/init.groovy.d"))
        }
        resources {
            setSrcDirs(emptyList<String>())
        }
    }
    test {
        java {
            setSrcDirs(emptyList<String>())
        }
        groovy {
            setSrcDirs(emptyList<String>())
        }
        resources {
            setSrcDirs(emptyList<String>())
        }
    }
}
