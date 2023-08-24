pipeline {
    agent any

    stages {
        stage('CLOUD SCM FROM GITHUB') {
            steps {
                echo 'cloning facebook code '
				git 'https://github.com/wakaleo/game-of-life.git'
            }
        }
		
        stage('BUILD ARTIFACT') {
            steps {
                echo 'builiding code using maven'
				sh 'mvn clean install'
            }
        }
		
        stage('DEPLOY TO TOMCAT') {
            steps {
                echo 'deploy to tomcat'
				deploy adapters: [tomcat7(credentialsId: 'tomcat', path: '', url: 'http://3.85.19.130:8081/')], contextPath: 'facebok', war: '**/*.war'
            }
        }
    }
}
