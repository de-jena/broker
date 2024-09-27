pipeline  {
	agent any

	environment {
		JAVA_OPTS = "-Xms4048m -Xmx4048m -XX:MaxMetaspaceSize=2048m ${sh(script:'echo $JAVA_OPTS', returnStdout: true).trim()}"
		VERSION = "${env.BUILD_ID}"
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
		
		stage('Make Executable') {

			steps {
				echo "Marking gradlew as executable"


				sh "chmod +x ./gradlew"

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
	
		stage('Resolve MQTT Bridge') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.mqttbridge.runtime:resolve.mqttbridge --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

		stage('MQTT Bridge Export') {
			when {
				branch 'main'
			}
			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.mqttbridge.runtime:export.mqttbridge --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
            }
        }
	
		stage('Resolve 5g Broker') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.sensinact.5g.runtime:resolve.base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

		stage('5G Export') {
			when {
				branch 'main'
			}
			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.sensinact.5g.runtime:export.de.jena.sensinact.5g.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

	
		stage('Prepare 5G Docker') {
			when {
				branch 'main'
			}
			steps  {
				echo "I am preparing docker: ${env.GIT_BRANCH}"

				sh "./gradlew prepareDocker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}

		}

		stage('Resolve UDP Broker') {

			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.sensinact.udp.runtime:resolve.de.jena.sensinact.udp.runtime.base --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

		stage('UDP Export') {
			when {
				branch 'main'
			}
			steps {
				echo "I am building app on branch: ${env.GIT_BRANCH}"


				sh "./gradlew :de.jena.sensinact.udp.runtime:export.de.jena.sensinact.udp.runtime.docker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}
		}

	
		stage('Prepare UDP Docker') {
			when {
				branch 'main'
			}
			steps  {
				echo "I am preparing docker: ${env.GIT_BRANCH}"

				sh "./gradlew prepareDocker --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"

			}

		}

		stage('Release'){
			when {
				branch 'main'
			}

			steps  {
				sh "./gradlew release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
		  }
		}

		stage('Docker 5G Image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker_5g',
							cloud: 'docker',
							tagsString: """registry-git.jena.de/scj/dim-broker:latest
                                        registry-git.jena.de/scj/dim-broker:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker_5g',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/scj/dim-broker:latest
							            devel.data-in-motion.biz:6000/scj/dim-broker:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}

		stage('Docker UDP Image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker_udp',
							cloud: 'docker',
							tagsString: """registry-git.jena.de/scj/udp-broker:latest
                                        registry-git.jena.de/scj/udp-broker:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker_udp',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/scj/udp-broker:latest
							            devel.data-in-motion.biz:6000/scj/udp-broker:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}
		stage('Docker Bridge Image build'){
			when {
				branch 'main'
			}

			steps  {
				echo "I am building and publishing a docker image on branch: ${env.GIT_BRANCH}"

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker_bridge',
							cloud: 'docker',
							tagsString: """registry-git.jena.de/scj/mqtt-bridge:latest
                                        registry-git.jena.de/scj/mqtt-bridge:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'github-jena'])

				step([$class: 'DockerBuilderPublisher',
				      dockerFileDirectory: 'docker_udp',
							cloud: 'docker',
							tagsString: """devel.data-in-motion.biz:6000/scj/mqtt-bridge:latest
							            devel.data-in-motion.biz:6000/scj/mqtt-bridge:0.1.0.${VERSION}""",
							pushOnSuccess: true,
							pushCredentialsId: 'dim-nexus'])
		  }
		}
	}
}
