pipeline {
    agent any 
    
    environment {
        DOCKER_PASSWORD = credentials('docker_password')
    }
    stages { 
        stage('SCM Checkout') {
            steps{
            git 'https://github.com/am-nimrah/portfolio.git'
            }
        }

        stage('Build docker image') {
            steps {  
                bat 'docker build -t nimrah/webportfolio .'
            }
        }

        stage('Login to Docker') {
            steps {
                bat "echo ${DOCKER_PASSWORD}|docker login -u nimrah --password-stdin"
                //bat 'docker login -u nimrah -p ${DOCKER_PASSWORD} localhost'
            }
        }
        }
    }
}