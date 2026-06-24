def call(String imageTag) {

    sh """
    sed -i 's|IMAGE_TAG|${imageTag}|g' K8s/backend/backend.yaml

    sed -i 's|IMAGE_TAG|${imageTag}|g' K8s/frontend/frontend.yaml

    kubectl apply -R -f K8s/
    """
}