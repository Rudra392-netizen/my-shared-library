def call() {
    stage("Build using maven") {
        sh "mvn clean package"
    }
}