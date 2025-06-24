def call() {
    // Fixed config
    String projectKey = 'java-app'
    String sonarUrl = 'http://44.201.86.107:9000'
    String credentialsId = 'SonarQube'  // Jenkins credential ID for Sonar token

    withCredentials([string(credentialsId: credentialsId, variable: 'SONAR_AUTH_TOKEN')]) {
        sh """
            mvn sonar:sonar \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.host.url=${sonarUrl} \
                -Dsonar.login=${SONAR_AUTH_TOKEN}
        """
    }
}
