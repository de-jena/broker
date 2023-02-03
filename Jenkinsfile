pipeline  {
	agent any

	environment {
		JAVA_OPTS = "-Xms2048m -Xmx2048m -XX:MaxMetaspaceSize=1024m ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
  }

	tools {
		jdk 'OpenJDK17'
	}

	options {
		buildDiscarder(logRotator(numToKeepStr: '5'))
	}

	stages {
		stage('clean workspace and checkout') {
			steps {
				deleteDir()
				checkout scm
			}
		}

		stage('App build') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew clean build -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

		stage('Integration Tests') {

			steps {
				echo "I am running integration tests on branch: ${env.GIT_BRANCH}"


				sh "./gradlew  testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

				junit testResults: '**/generated/test-reports/**/*.xml', allowEmptyResults: true

			}
		}
	
	
		stage('Resolve') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.sensinact.runtime:resolve.base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

		stage('Export') {
			when {
				branch 'main'
			}
			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.sensinact.runtime:export.de.jena.sensinact.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

	
		stage('Prepare Docker') {
			when {
				branch 'main'
			}
			steps  {
				echo "I am preparing docker: ${env.GIT_BRANCH}"

				sh "./gradlew prepareDocker -x testOSGi --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}

		}

		stage('Docker image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker',
							cloud: 'docker',
							tagsString: 'registry-git.jena.de/scj/dim-broker:latest',
							pushOnSuccess: true,
							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker',
							cloud: 'docker',
							tagsString: 'devel.data-in-motion.biz:6000/scj/dim-broker:latest',
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}
	}
}
