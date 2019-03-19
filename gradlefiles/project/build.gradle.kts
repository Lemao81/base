import com.android.build.gradle.BaseExtension

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Plugins.androidBuild)
        classpath(Plugins.kotlin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(Urls.mavenLocalInternal)
    }

    disableLintTasks(this)

    this.afterEvaluate {
        val android = this.extensions.findByName(Extensions.android) as? BaseExtension
        android?.variantFilter {
            if (this.buildType.name == BuildTypes.release) {
                this.setIgnore(true)
            }
        }
    }
}

subprojects {
    apply(from = Paths.ktlint)
}

tasks.create<Delete>("clean") {
    group = "Cleanup"
    doLast { delete(rootProject.buildDir) }
}