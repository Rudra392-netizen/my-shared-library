def call(String imageName, String appPath) {
    sh """
        cd ${appPath}
        docker build -t ${imageName} .
    """
}
