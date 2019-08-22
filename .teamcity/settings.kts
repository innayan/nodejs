import jetbrains.buildServer.configs.kotlin.v2018_2.*

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2019.1"

project {

    buildType(Jonnizzz)
}

object Jonnizzz : BuildType({
    name = "jonnizzz"

    steps {
        step {
            type = "jonnyzzz.node"
            param("node_script_text", """
                console.log("##teamcity[testSuiteStarted name='ie11']")
                                console.log("##teamcity[testSuiteStarted name='Button']")
                                console.log("##teamcity[testSuiteStarted name='playground']")
                                console.log("##teamcity[testStarted name='idle']")
                                console.log("##teamcity[testFinished name='idle']")
                                console.log("##teamcity[testSuiteFinished name='playground']")
                                console.log("##teamcity[testSuiteFinished name='Button']")
                                console.log("##teamcity[testSuiteFinished name='ie11']")
            """.trimIndent())
            param("node_execution_mode", "script")
        }
    }
})
object FrontendInfrastructure_Testoutput : BuildType({
    id("Testoutput")
    name = "Testoutput"
    steps {
        step {
            name = "output"
            type = "jonnyzzz.node"
            param("node_script_text", """
                console.log("##teamcity[testSuiteStarted name='ie11']")
                console.log("##teamcity[testSuiteStarted name='Button']")
                console.log("##teamcity[testSuiteStarted name='playground']")
                console.log("##teamcity[testStarted name='idle']")
                console.log("##teamcity[testFinished name='idle']")
                console.log("##teamcity[testSuiteFinished name='playground']")
                console.log("##teamcity[testSuiteFinished name='Button']")
                console.log("##teamcity[testSuiteFinished name='ie11']")
            """.trimIndent())
            param("node_execution_mode", "script")
        }
    }
})
