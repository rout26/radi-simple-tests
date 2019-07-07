pipeline {

    agent any
    stages {

        stage('unit-test') {


            steps {
                bat(/"mvn" -Dthrow=true  clean test/)

            }
        }
    }

}