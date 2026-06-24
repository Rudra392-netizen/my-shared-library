def call(String IMAGE_NAME, String dockerHubCred, String imageTag) {
    withCredentials([usernamePassword(
        credentialsId: dockerHubCred,
        usernameVariable: "DOCKER_USER",
        passwordVariable: "DOCKER_PASS"
   )]) {
        sh """
            docker login -u $DOCKER_USER -p $DOCKER_PASS
            docker push ${IMAGE_NAME}:${imageTag}
            docker logout
        """
   } 
}
