def call(string IMAGE_NAME) {
    sh "docker build -t ${IMAGE_NAME} ."
}