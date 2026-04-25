def call(String path) {
    sh "cd ${path} && npm install"
}