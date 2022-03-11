
node {
  def app
     stage('clone') {
         checkout scm
       }
        stage('Build image') {
          app = docker.build("jenk/nginx")
     }
      stage ( 'test image') {
          docker.image('jenk/nginx').WithRun ('-p 8085:80') { c->
          sh 'docker ps'
          sh 'curl localhost'
   }
 }
}
