def call() {
    dir('demo') {
        echo "Running Maven tests"
        sh './mvnw test'
    }
}
