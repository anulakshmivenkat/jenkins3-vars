// vars/buildAndTestPipeline.groovy

def call() {
    pipeline {
        agent any

        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }

            stage('Build') {
                steps {
                    script {
                        // Build your project (e.g., compile code, generate artifacts)
                        sh 'mvn clean install'  // Replace with your build commands
                    }
                }
            }

            stage('Test') {
                steps {
                    script {
                        // Run tests on your project (e.g., unit tests, integration tests)
                        sh 'mvn test'  // Replace with your test commands
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
}
