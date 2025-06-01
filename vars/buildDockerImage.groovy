def call(String imageName = 'my-image:latest') {
    echo "Building Docker image: ${imageName}"
    sh "docker build -t ${imageName} ."
}
