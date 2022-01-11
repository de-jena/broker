pipeline  {
	agent any

	environment {
		imagename = 'jena/broker'
		dockerImage = ''
		JAVA_OPTS = "-Xms2048m -Xmx2048m -XX:MaxMetaspaceSize=1024m ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
  }

	tools {
		jdk 'OpenJDK8'
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


				sh "./gradlew clean build -x itest --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

		stage('Integration Tests') {

			steps {
				echo "I am running integration tests on branch: ${env.GIT_BRANCH}"


				sh "./gradlew clean build itest --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

				junit testResults: '**/generated/test-reports/**/*.xml', allowEmptyResults: true

			}
		}

		stage('Release') {
			when {
				branch 'main'
			}

			steps {
				echo "I am creating a release on branch: ${env.GIT_BRANCH}"

				sh "./gradlew clean build release prepareDocker -Drelease.dir=release/ -x itest --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}

		}

		stage('Snapshot release') {
			when {
				branch 'develop'
			}

			steps  {
				echo "I am creating a release on branch: ${env.GIT_BRANCH}"

				sh "./gradlew release prepareDocker -x itest --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}

		}

		stage('Snapshot docker image build'){
			when {
				branch 'develop'
			}

			steps  {

				script {
					commitHashShort = sh(script: "git log -1 --format=%h", returnStdout: true).trim()
				}

				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'de.jena.sensinact.runtime/generated/docker',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/jena/broker:latest
														 devel.data-in-motion.biz:6000/jena/broker:${commitHashShort}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])

			}

		}

		stage('Docker image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'de.jena.sensinact.runtime/generated/docker',
							cloud: 'docker',
							tagsString: 'devel.data-in-motion.biz:6000/jena/broker:release',
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}
	}
}
