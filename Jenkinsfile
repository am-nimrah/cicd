pipeline {
    agent any

    stages {
        stage('Checkout & Compile') {
            steps {
                git url: 'https://github.com/am-nimrah/cicd.git', branch: 'main'
                sh "PATH=$PATH:/path/to/java/bin && javac GuessTheNumber.java"
            }
        }
        stage('Execute Game') {
            steps {
                sh 'java GuessTheNumber'
            }
        }
    }

    post {
        success {
            echo 'GuessTheNumber game built and run successfully!'
        }
        failure {
            echo 'GuessTheNumber game build or execution failed!'
        }
    }
}