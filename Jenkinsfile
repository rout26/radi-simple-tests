pipeline {
    agent any
    stages {
        stage('Checkout') {
            checkout scm

            def mvnHome = tool 'M3'
        }
        stage('Build') {


            steps {
                bat "${mvnHome}/bin/mvn clean test"
            }
        }
    }

    post {
            always {
                echo 'I will always say Hello again!'
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
}