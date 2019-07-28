val deployProjectPath = "buildSrc\\src\\main\\java"
val deployFileNames = arrayOf("Dependencies.kt", "Constants.kt")
val deployProjects = listOf(
    "base",
    "ProjectX",
    "AndroidUtils",
    "CustomViews",
    "StackDownloader",
    "MovieReleases",
    "BabyLock"
)

tasks.create("deployDependencies") {
    description = "Copies buildSrc constants-kt-files to android projects"
    group = "Deploy"

    doLast {
        println("Task ${this.name} started")
        deployProjects.forEach { project ->
            deployFileNames.forEach { fileName ->
                copy {
                    val fromPath = "$projectDir\\baseFiles\\buildSrcDeployment\\$fileName"
                    val toPath = "$projectDir\\..\\$project\\$deployProjectPath"

                    from(file(fromPath))
                    into(file(toPath))
                    println("Copied $fileName to $toPath")
                }
            }
        }
    }
}