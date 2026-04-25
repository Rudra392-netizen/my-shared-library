def call(String appPath, String sonarCredsId, String sonarUrl, String projectKey) {
    withSonarQubeEnv("sonarqube") {
        withCredentials([string(credentialsId: sonarCredsId, variable: 'SONAR_TOKEN')]) {
            sh """
                cd ${appPath}
                sonar-scanner \
                    -Dsonar.projectKey=${projectKey} \
                    -Dsonar.sources=. \
                    -Dsonar.host.url=${sonarUrl} \
                    -Dsonar.login=$SONAR_TOKEN
            """
        }
    }
}