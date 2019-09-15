pipeline {

    agent any
    stages {

        stage('unit-test') {


            steps {
                bat(/mvn -Dthrow=false  clean test -Dfail=true -Dthrow=false/)
                junit '**/target/surefire-reports/TEST-*.xml'

            }
        }
    }



}
