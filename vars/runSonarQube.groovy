def call(string SonarQube, string sonarUrl) {
    stage("sonarqube analysis") {
        withSonarQubeEnv("SonarQube"){
            withCredentials([usernamePassword(
                credentialsId: SonarQube,
                usernameVariable: "SONAR_USER",
                passwordVariable: "SONAR_PASS"
            )])
            sh """
            -Dsonar.login=$SONAR_USER \
            -Dsonar.host.url=$${sonarurl} \
            -Dsonar.password=$SONAR_PASS \
            -Dsonar.projectKey=${project.Key}
            """

        }
    }
}