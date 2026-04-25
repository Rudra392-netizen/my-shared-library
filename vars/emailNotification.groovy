def call(String email) {
    stage('Email Notification') {
        mail to: email,
             subject: "Build ${currentBuild.currentResult}",
             body: "Build Status: ${currentBuild.currentResult}"
    }
}
