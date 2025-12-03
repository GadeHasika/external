pipeline{
    agent any
    stages{
        stage('compile'){
            steps{
                bat 'javac Fact.java Test.java'
            }

        }
        stage('Test'){
            steps{
                bat 'java Test.java'
            }
        }
        stage('Run'){
            steps{
                bat 'java Fact.java'
            }
        }
        stage('package JAR'){
            steps{
                bat 'cfm factorial.jar manifest.txt Fact.class'
            }
        } 
    }
}
