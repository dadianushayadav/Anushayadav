pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Clone to GIT HUB'
				git branch: 'main', credentialsId: 'Github-jenkins', url: 'https://github.com/dadianushayadav/Anushayadav.git'
            }
        }
		
        stage('Build') {
            steps {
                echo 'Build artifact'
				sh 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy to Web application'
				deploy adapters: [tomcat9(credentialsId: 'tomcat-cred', path: '', url: 'http://18.210.10.2:8081/')], contextPath: null, war: '**/*.war'
            }
        }		
    }
}
