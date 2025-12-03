pipeline{
    agent any
    stages{
        stage('compile'){
            steps{
                bat 'javac Fact.java'
            }

        }
        // stage('Test'){
        //     steps{
        //         bat 'java Test'
        //     }
        // }
        stage('Run'){
            steps{
                bat 'java Fact.java'
            }
        }
        stage('package JAR'){
            steps{
                bat 'cfm Factori.jar manifest.txt Fact.class'
            }
        } 
    }
}
