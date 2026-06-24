def call(String imageName, String appPath, String imageTag) {
    sh """
        cd ${appPath}
        docker build -t ${imageName}:${imageTag} .
    """
}
