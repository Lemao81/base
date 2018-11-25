import com.android.build.gradle.BaseExtension

buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath(Plugins.androidGradle)
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
        val android = this.extensions.findByName(ProjectExtension.android) as? BaseExtension
        android?.variantFilter {
            if (this.buildType.name == BuildTypes.release)
                this.setIgnore(true)
        }
    }

    apply(from = "$rootDir/ktlint.gradle")
}

tasks.create<Delete>("clean") {
    group = "Cleanup"
    doLast { delete(rootProject.buildDir) }
}