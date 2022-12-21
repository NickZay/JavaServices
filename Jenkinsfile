pipeline {
  agent any
  stages {
    stage("build") {
      steps {
        echo 'build'
        sh 'pwd'
        sh 'ls -la'
        withGradle {
          sh './gradlew build'
        }
      }
    }
    stage("test") {
      steps {
        echo 'test'
      }
    }
    stage("allure") {
      steps {
        echo 'allure'
      }
    }
    stage("sonarqube") {
      steps {
        echo 'sonarqube'
      }
    }
    stage("deploy") {
      steps {
        echo 'deploy'
      }
    }
  }
}
