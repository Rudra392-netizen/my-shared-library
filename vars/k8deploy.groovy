def call() {
    stage('Deploy to Kubernetes') {
        sh 'kubectl apply -f k8s/deployment.yaml'
    }
}
