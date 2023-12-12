pipeline {
  agent any

  stages {
    stage('Access Code') {
      steps {
        git url: 'https://github.com/am-nimrah/cicd.git', branch: 'main'
      }
    }
    stage('Compile Code') {
      steps {
        sh 'javac GuessTheNumber.java'
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