pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build Project'
            }
        }
        stage('Unit Tests') {
            steps {
                echo 'Applying unit tests'
            }
        }
        stage('Deploy to Stage') {
            steps {
                echo 'Deploying to environment HOM (staging).'
            }
        }
        stage('Acceptance Tests') {
            steps {
                echo 'Fazer deploy em ambiente de homologação (staging).'
            }
        }          
    }
}