def call(String IMAGE_NAME) {
    sh """
        trivy image --timeout 10m ${IMAGE_NAME} > trivy.report.txt
    """
}
