val deployProjectPath = "buildSrc\\src\\main\\java"
val deployFileNames = arrayOf("Dependencies.kt", "Constants.kt", "Global.kt")
val deployProjects = listOf(
    "base",
    "ProjectX",
    "AndroidUtils",
    "CustomViews",
    "StackDownloader",
    "MovieReleases",
    "BabyLock",
    "Gradleplugins",
    "Share",
    "VocabularyTrainer"
)
val additionalDeployPaths = listOf(
    "C:\\Users\\Jueggs\\IdeaProjects\\Gradleplugins\\buildSrc\\src\\main\\kotlin"
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
        additionalDeployPaths.forEach { additionalDeployPath ->
            deployFileNames.forEach { fileName ->
                copy {
                    val fromPath = "$projectDir\\baseFiles\\buildSrcDeployment\\$fileName"

                    from(file(fromPath))
                    into(file(additionalDeployPath))
                    println("Copied $fileName to $additionalDeployPath")
                }
            }
        }
    }
}