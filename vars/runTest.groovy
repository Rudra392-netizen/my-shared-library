def call(String path) {
    sh "cd ${path} && npm test"
}