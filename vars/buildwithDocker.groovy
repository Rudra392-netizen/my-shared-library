def call(String IMAGE_NAME) {
    sh "docker build -t ${IMAGE_NAME} ."
}
