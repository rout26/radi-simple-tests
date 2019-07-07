pipeline {

    agent any
    stages {

        stage('unit-test') {


            steps {
                bat(/mvn -Dthrow=false  clean test/)

            }
        }
    }

    post {
            always {
                echo 'I will always say Hello again!'
            }
        }

}