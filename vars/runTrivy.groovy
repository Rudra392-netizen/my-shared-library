def call(string IMAGE_NAME) {
    stage("Trivy scan") {
        sh "trivy image ${IMAGE_NAME}>trivy.report.txt"
    }
}