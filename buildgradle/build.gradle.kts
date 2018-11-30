import com.android.build.gradle.BaseExtension
import buildSrc.*

buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath(Plugin.androidGradle)
        classpath(Plugin.kotlin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(Url.mavenLocalInternal)
    }

    disableLintTasks(this)

    this.afterEvaluate {
        val android = this.extensions.findByName(Extension.android) as? BaseExtension
        android?.variantFilter {
            if (this.buildType.name == BuildType.release)
                this.setIgnore(true)
        }
    }

    apply(from = "$rootDir/ktlint.gradle")
}

tasks.create<Delete>("clean") {
    group = "Cleanup"
    doLast { delete(rootProject.buildDir) }
}