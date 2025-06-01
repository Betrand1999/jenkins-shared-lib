def call() {
    sh 'ls -l'
    sh 'pwd'
    echo "Running Maven tests"
    sh './mvnw test'
}
