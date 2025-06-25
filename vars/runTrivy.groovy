def call(String IMAGE_NAME) {
    stage("Trivy scan") {
        sh "trivy image ${IMAGE_NAME}>trivy.report.txt"
    }
}