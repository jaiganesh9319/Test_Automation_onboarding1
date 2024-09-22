node {
   stage("Prepare"){
    git url: "https://github.com/Ranjithdss15/helloworld.git", branch: "jenkins-deploy"
  }
  stage("Build"){
    bat "npm install"
  }
  stage("Deploy"){
    bat "npm start"
  }
}
