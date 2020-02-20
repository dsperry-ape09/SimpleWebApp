node {
    stage('Preparation') {
       git 'https://github.com/dsperry-ape09/SimpleWebApp.git'
    }
    stage('Build') {
       sh "./gradlew clean test"
    }
    stage('Deploy') {
        sh "git push https://git.heroku.com/arcane-anchorage-88125.git  master"
    }
 }