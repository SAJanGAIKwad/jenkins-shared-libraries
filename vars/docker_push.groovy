def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      bat "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  bat "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
