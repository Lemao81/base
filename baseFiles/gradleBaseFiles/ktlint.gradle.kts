configurations.create("ktlint")

dependencies {
    add("ktlint", Libs.ktlint)
}

tasks.create<JavaExec>("ktlint") {
    group = "verification"
    description = "Check Kotlin code style."
    classpath = configurations.getByName("ktlint")
    main = "com.github.shyiko.ktlint.Main"
    args("src/**/*.kt")
}

tasks.create<JavaExec>("ktlintFormat") {
    group = "formatting"
    description = "Fix Kotlin code style deviations."
    classpath = configurations.getByName("ktlint")
    main = "com.github.shyiko.ktlint.Main"
    args("-F", "src/**/*.kt")
}