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
    group = "Deploy"

    val fromPath = "$projectDir\\buildSource\\$deployFileName"
    println(fromPath)

    deployProjects.forEach { project ->
        copy {
            val toPath = "$projectDir\\..\\" + project + File.separator + deployProjectPath
            println(toPath)

            from(file(fromPath))
            into(file(toPath))
        }
    }
}