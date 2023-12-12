pipeline {
    agent any

    environment {
        PORT = 8080 // You can use any available port
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Clean workspace before checkout
                    deleteDir()

                    // Checkout the main branch
                    git credentialsId: 'git-credential', url: 'https://github.com/am-nimrah/cicd.git', branch: 'main'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Copy nimra.html to the workspace
                    sh 'cp nimra.html .'

                    // Start a simple Python HTTP server to serve the HTML file
                    sh "python3 -m http.server ${PORT} &"

                    // Display the URL in the Jenkins console
                    echo "Portfolio is available at: http://localhost:${PORT}/nimra.html"

                    // Open the portfolio in the default web browser
                    script {
                        sh "xdg-open http://localhost:${PORT}/nimra.html || open http://localhost:${PORT}/nimra.html || start http://localhost:${PORT}/nimra.html"
                    }
                }
            }
        }
    }
}
