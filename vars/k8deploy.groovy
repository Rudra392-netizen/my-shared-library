def call(imageName, imageTag) {
    withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {

        sh """
        kubectl set image deployment/java-app \
        java-app=${imageName}:${imageTag}

        kubectl rollout status deployment/java-app
        """
    }
}
