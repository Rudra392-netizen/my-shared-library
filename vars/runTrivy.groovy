def call(String IMAGE_NAME) {   
    sh "trivy image ${IMAGE_NAME}>trivy.report.txt"
   }