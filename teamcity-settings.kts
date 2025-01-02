import jetbrains.buildServer.configs.kotlin.v2023_2.*

version = "2023.2"

project {
    name = "LocalPythonProject"

    buildType(RunHelloWorldScript)
}

object RunHelloWorldScript : BuildType({
    name = "Run Hello World Script"

    steps {
        script {
            name = "Run Python Script"
            scriptContent = """
                python3 /opt/teamcity/hello_world.py
            """.trimIndent()
        }
    }
})

