node
{
    stage('Git checkout'){
        git 'https://github.com/miccloudtest/demo'
    }
    stage('compile'){
        def mvnHome= tool name: 'maven_3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn clean compile"
    }
    stage('test'){
        def mvnHome= tool name: 'maven_3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn test"
    }
    stage('package'){
        def mvnHome= tool name: 'maven_3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    stage ('Deploy') {
                    /* withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                      credentialsId   : 'PCF_LOGIN',
                                      usernameVariable: 'USERNAME',
                                      passwordVariable: 'PASSWORD']]) {
                        sh '/usr/local/bin/cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                        sh '/usr/local/bin/cf push' */
                        pushToCloudFoundry cloudSpace: 'development', credentialsId: 'PCF_LOGIN', organization: 'gauri-org', target: 'api.run.pivotal.io'

                    }
}

