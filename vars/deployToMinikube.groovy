// File: vars/deployToMinikube.groovy

def call(String yamlFile = 'demo/kubernetes/deployment.yaml') {
    echo "Deploying to Minikube using ${yamlFile}"

    sh 'eval "$(/usr/local/bin/minikube docker-env)"'
    sh "kubectl apply -f ${yamlFile}"
}
