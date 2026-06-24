def call(String imageTag) {

    sh """
    sed -i 's|IMAGE_TAG|${imageTag}|g' K8s/backend.yaml

    sed -i 's|IMAGE_TAG|${imageTag}|g' K8s/frontend.yaml

    kubectl apply -f K8s/
    """
}