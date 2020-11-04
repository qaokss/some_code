apply(plugin = "java-library")


    repositories {
        jcenter()
    }


dependencies {
    "testImplementation"("junit:junit:4.13.1")
    "testImplementation"("com.codeborne:selenide:5.15.1")
    "testRuntimeOnly"("org.slf4j:slf4j-simple:1.7.30")
    "testImplementation"("io.qameta.allure:allure-selenide:2.13.6")
    "testImplementation"("io.qameta.allure:allure-junit-platform:2.13.6")

}

configurations {
    "implementation" {
        resolutionStrategy.failOnVersionConflict()
    }
}

configure<SourceSetContainer> {
    named("main") {
        java.srcDir("src/core/java")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    named<Test>("test") {
        testLogging.showExceptions = true
    }
}