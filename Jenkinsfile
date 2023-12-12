pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/am-nimrah/cicd.git', branch: 'main'
            }
        }
        stage('Build & Compile') {
            steps {
                sh 'javac GuessTheNumber.java'
            }
        }
        stage('Run the Game') {
            steps {
                sh 'java GuessTheNumber'
            }
        }
        stage('Publish Results') {
            steps {
                archiveArtifacts artifacts: 'GuessTheNumber.class,README.md', fingerprint: true
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