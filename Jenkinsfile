pipeline {
  agent {
    dockerfile true
  }
  triggers {
    cron '@midnight'
  }
  options {
    buildDiscarder(logRotator(numToKeepStr: '30', artifactNumToKeepStr: '5'))
  }
  stages {
    stage('build') {      
      steps {        
        script {
          maven cmd: 'clean install'
        }
      }
      post {
        success {
          archiveArtifacts 'xtrans/target/*.iar'
          junit '**/target/surefire-reports/**/*.xml' 
        }
      }
    }
  }
}
