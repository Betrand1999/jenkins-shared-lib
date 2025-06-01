def call(String imageName = 'my-image:latest', String credsId = 'dockerhub-creds-id') {
    withCredentials([usernamePassword(credentialsId: credsId, usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh """
            echo "\$PASS" | docker login -u "\$USER" --password-stdin
            docker push ${imageName}
            docker logout
        """
    }
}
