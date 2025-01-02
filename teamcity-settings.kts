import jetbrains.buildServer.configs.kotlin.v2023_2.*

version = "2023.2"

project {
    name = "LocalPythonProject"
    id("LocalPythonProject")

    buildType(LocalPythonProject_RunHelloWorldScript)
    vcsRoot(LocalPythonProject_HttpsGithubComJesuusgallegoArchivoconfigteamcityGitRefsHeadsMain)
}

object LocalPythonProject_RunHelloWorldScript : BuildType({
    name = "Run Hello World Script"
    id("LocalPythonProject_RunHelloWorldScript")

    steps {
        script {
            name = "Run Python Script"
            scriptContent = """
                python3 /opt/teamcity/hello_world.py
            """.trimIndent()
        }
    }

    vcs {
        root(LocalPythonProject_HttpsGithubComJesuusgallegoArchivoconfigteamcityGitRefsHeadsMain)
    }
})

object LocalPythonProject_HttpsGithubComJesuusgallegoArchivoconfigteamcityGitRefsHeadsMain : GitVcsRoot({
    name = "GitHub Repo"
    id("LocalPythonProject_HttpsGithubComJesuusgallegoArchivoconfigteamcityGitRefsHeadsMain")

    url = "https://github.com/jesuusgallego/archivoconfigteamcity.git"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "jesuusgallego"
        password = "11032002116j"
    }
})
