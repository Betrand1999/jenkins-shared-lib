def call() {
    dir('demo') {
        echo "Building application JAR"
        sh './mvnw clean package'
    }
}
