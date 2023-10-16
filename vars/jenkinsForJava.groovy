@Library('myjava-library') _

pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code
                checkout scm
            }
        }

        stage('Call Shared Library Function') {
            steps {
                script {
                    // Call a function from the shared library
                    jenkinsForJava.myFunction()
                }
            }
        }
    }

    post {
        success {
            echo 'Shared library function called successfully!'
        }
        failure {
            echo 'Shared library function call failed!'
        }
    }
}
