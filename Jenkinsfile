pipeline {
    agent any
    stages {

        stage('unit-test') {


            steps {
                mvn('clean install')
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