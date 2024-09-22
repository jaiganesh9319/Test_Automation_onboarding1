node {
   stage("Prepare"){
    git url: "https://github.com/jaiganesh9319/Test_Automation_onboarding1.git", branch: "Tasks"
  }
  stage("Build"){
    bat "cd CICD/helloworld && npm install"
  }
  stage("Deploy"){
    bat "cd CICD/helloworld && npm start"
  }
}
