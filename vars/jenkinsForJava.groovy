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

        stage('Build and Test') {
            steps {
                script {
                    // Call a function from the shared library
                    myFunction()
                }
            }
        }
    }

    post {
        success {
            echo 'Build and test successful!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}
