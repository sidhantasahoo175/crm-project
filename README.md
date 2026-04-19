#  CRM Project with CI/CD, Docker & AWS EC2

##  Project Overview

This project is a **Customer Relationship Management (CRM) application** built using Spring Boot.
CRM application for managing customer data (create, update, delete, view) built using Spring Boot REST APIs
It demonstrates **end-to-end DevOps practices** including CI/CD automation, containerization using Docker, and deployment on AWS EC2.

---

##  Tech Stack

* **Backend:** Java, Spring Boot
* **Build Tool:** Maven
* **CI/CD:** Jenkins
* **Containerization:** Docker
* **Cloud Platform:** AWS EC2
* **Version Control:** Git & GitHub

---

##  Features

* REST APIs for CRM operations
* Maven-based project structure
* Automated CI/CD pipeline
* Dockerized application
* Cloud deployment on AWS EC2

---

##  CI/CD Pipeline Workflow

1. Developer pushes code to GitHub
2. Jenkins detects changes (via webhook/manual trigger)
3. Jenkins pipeline executes:

   * Build project using Maven
   * Run tests
   * Build Docker image
   * Deploy container on EC2
4. Application is updated automatically

---

##  Jenkins Pipeline (Jenkinsfile)

```groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t crm-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8080:8080 crm-app'
            }
        }
    }
}
```

---

##  Docker Setup

### Dockerfile

```dockerfile
FROM openjdk:17
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

### Commands

```bash
docker build -t crm-app .
docker run -d -p 8080:8080 crm-app
```

---
## AWS EC2 Deployment

* Created EC2 instance (Linux)
* Installed Docker
* Cloned GitHub repository
* Built Docker image
* Ran container on port 8080

### Access Application:

http://<EC2-Public-IP>:8080

---

##  Project Structure

```
crm-project/
│── src/
│── Dockerfile
│── Jenkinsfile
│── pom.xml
│── README.md
```

---

##  Key Highlights

* Implemented CI/CD pipeline using Jenkins
* Automated build and deployment process
* Containerized application using Docker
* Deployed application on AWS EC2

---

##  Future Improvements

* Add database integration (MySQL/PostgreSQL)
* Use Docker Compose
* Deploy using Kubernetes
* Add authentication & security

---

## 👨‍💻 Author

**Sidhanta Sahoo**
