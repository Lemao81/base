val deployProjectPath = "buildSrc\\src\\main\\java"
val deployFileName = "Dependencies.kt"

val deployProjects = listOf(
    "ProjectX",
    "AndroidUtils",
    "CustomViews",
    "StackDownloader"
)

tasks.create<Copy>("deployDependencies") {
    description = "Copies buildSrc/Dependencies.kt to android projects"
    group = "deploy"

    doLast {
        val fromPath = "$projectDir\\buildSource\\$deployFileName"

        deployProjects.forEach { project ->
            copy {
                val toPath = "$projectDir\\..\\" + project + File.separator + deployProjectPath

                from(file(fromPath))
                into(file(toPath))
            }
        }
    }
}