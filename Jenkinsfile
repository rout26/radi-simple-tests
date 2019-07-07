pipeline {

    agent any
    stages {

        stage('unit-test') {


            steps {
                mvn('clean install')
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
    }

}