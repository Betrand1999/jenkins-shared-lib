def call(String imageName = 'my-image:latest') {
    echo "Building Docker image: ${imageName}"
    dir('demo') {
        sh "docker build -t ${imageName} ."
    }
}
