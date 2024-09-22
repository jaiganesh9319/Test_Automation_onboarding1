pipeline {
    agent any
    stages {
        stage('Prepare') {
            steps {
                git url: "https://github.com/Ranjithdss15/helloworld.git", branch: "jenkins-deploy"
            }
        }
          stage('Build') {
            steps {
                bat "npm install"
            }
        }
          stage('Deploy') {
            steps {
                bat "npm start"
            }
        }
    }
}
