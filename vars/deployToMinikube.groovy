def call(String yamlFile = 'k8s/deployment.yaml') {
    echo "Deploying to Minikube using ${yamlFile}"
    def content = libraryResource(yamlFile)
    writeFile file: 'deployment.yaml', text: content

    sh 'eval "$(/usr/local/bin/minikube docker-env)"'
    sh 'kubectl apply -f deployment.yaml'
}
