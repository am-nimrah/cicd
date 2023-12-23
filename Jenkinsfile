pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    // Clone the Git repository
                    checkout scm

                    // Build the Docker image
                    sh 'docker build -t nimrah/portfolio:latest .'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Add your testing steps here if needed
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deploy the Docker container to Azure
                    sh "docker login -u $DOCKER_HUB_USERNAME -p ${DOCKER_HUB_PASSWORD} ${DOCKER_REGISTRY}"
                    sh 'docker push nimrah/portfolio:latest'
                    sh 'ssh azure-user@your-azure-vm-ip "docker pull nimrah/portfolio:latest && docker stop your-container-name && docker rm your-container-name && docker run -d -p 80:80 --name your-container-name nimrah/portfolio:latest"'
                }
            }
        }
    }

    post {
        failure {
            // Email notification in case of a failed deployment
            emailext attachLog: true, subject: 'Failed Deployment - Your Web App', body: 'The deployment of your web app has failed. Please investigate.'
        }
    }
}
