pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sidhantasahoo175/crm-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t crm-app .'
            }
        }

        stage('Run') {
            steps {
                sh 'docker stop crm || true'
                sh 'docker rm crm || true'
                sh 'docker run -d -p 8080:8080 --name crm crm-app'
            }
        }
    }
}