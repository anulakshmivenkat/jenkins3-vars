// vars/mySharedLibrary.groovy

def buildJavaApp() {
    // Your build steps here
    echo 'Building Java application...'
    sh 'mvn clean install'
}

def testJavaApp() {
    // Your test steps here
    echo 'Running tests...'
    sh 'mvn test'
}
