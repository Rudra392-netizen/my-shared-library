def call(String IMAGE_NAME) {
    stage("Build with docker") {
        sh "docker build -t ${DOCKER_IMAGE}"
    }
}