pipeline {
  agent any

  stages {
    stage('Access Code') {
      steps {
        git url: 'https://github.com/am-nimrah/cicd.git', branch: 'main'
      }
    stage('Access Code2') {
      steps {
        git url: 'https://github.com/am-nimrah/cicd.git', branch: 'main'
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