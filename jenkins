pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
             git branch: 'main',url: 'https://github.com/Subhraneel2003/Devops_Maven_Capgemini.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
         
         
        }

        stage('Run JUnit Tests') {
            steps {
                bat 'mvn test'
            }
        }

       stage('SonarQube Analysis') {
          steps {
          withSonarQubeEnv('SonarServer') {
            bat 'mvn clean verify sonar:sonar'
        }
    }
}

    }
}