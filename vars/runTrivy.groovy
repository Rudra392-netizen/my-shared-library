def call(String IMAGE_NAME, String image_tag) {
    sh """
        trivy image --timeout 10m ${IMAGE_NAME}:${image_tag} > trivy.report.txt
    """
}
