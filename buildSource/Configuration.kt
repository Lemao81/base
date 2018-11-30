package buildSrc

import org.gradle.api.Project
import org.gradle.kotlin.dsl.*

fun disableLintTasks(project: Project) {
    project.tasks.whenTaskAdded {
        if (this.name.startsWith("lint"))
            this.enabled = false
    }
}