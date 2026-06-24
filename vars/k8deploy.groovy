def call(String imageTag) {

    sh """
    sed -i 's|IMAGE_TAG|${imageTag}|g' k8s/backend-deployment.yaml

    sed -i 's|IMAGE_TAG|${imageTag}|g' k8s/frontend-deployment.yaml

    kubectl apply -f k8s/
    """
}