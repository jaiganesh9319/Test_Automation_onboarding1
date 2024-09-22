pipeline {
    agent any
    stages {
        stage('Prepare') {
            steps {
                git url: "https://github.com/jaiganesh9319/Test_Automation_onboarding1.git", branch: "Tasks"
            }
        }
          stage('Build') {
            steps {
                bat "cd CICD/helloworld && npm install"
            }
        }
          stage('Deploy') {
            steps {
                bat "cd CICD/helloworld && npm start"
            }
        }
    }
}
