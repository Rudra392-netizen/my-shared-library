def call(String sonarCredsId, String sonarUrl, String projectKey) {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQube') {
            withCredentials([usernamePassword(
                credentialsId: sonarCredsId,
                usernameVariable: 'SONAR_USER',
                passwordVariable: 'SONAR_PASS'
            )]) {
                sh """
                    mvn sonar:sonar \
                    -Dsonar.login=$SONAR_USER \
                    -Dsonar.password=$SONAR_PASS \
                    -Dsonar.host.url=${sonarUrl} \
                    -Dsonar.projectKey=${projectKey}
                """
            }
        }
    }
}
