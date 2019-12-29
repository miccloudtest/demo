node
{
    stage('Git checkout'){
        git 'https://github.com/miccloudtest/demo'
    }
    stage('compile package'){
        def mvnHome= tool name: 'maven_3.6.3', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
}


