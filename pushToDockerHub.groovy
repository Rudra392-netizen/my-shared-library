def call(String IMAGE_NAME, String dockerHubCred) {
    withCredentials([usernamePassword(
        credentialsId: dockerHubCred,
        usernameVariable: "DOCKER_USER",
        passwordVariable: "DOCKER_PASS"
   )]) {
        sh """
            docker login -u $DOCKER_USER -p $DOCKER_PASS
            docker push ${IMAGE_NAME}
            docker logout
        """
   } 
}