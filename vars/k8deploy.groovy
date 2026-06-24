def call(String imageTag) {

    sh """
    sed -i 's|IMAGE_TAG|${imageTag}|g' k8s/backend.yaml

    sed -i 's|IMAGE_TAG|${imageTag}|g' k8s/frontend.yaml

    kubectl apply -f k8s/
    """
}