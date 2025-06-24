def call(String sonarCredsId, String sonarUrl, String projectKey) {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQube') {
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
}

