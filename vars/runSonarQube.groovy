def call(String sonarCredsId, String sonarUrl, String projectKey) {
    withSonarQubeEnv("sonarqube") {
        withCredentials([string(credentialsId: sonarCredsId, variable: 'SONAR_TOKEN')]) {
            sh """
                mvn sonar:sonar \
                    -Dsonar.login=$SONAR_TOKEN \
                    -Dsonar.host.url=${sonarUrl} \
                    -Dsonar.projectKey=${projectKey}
            """
        }
    }
}
