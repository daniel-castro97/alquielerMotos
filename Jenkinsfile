pipeline{
  agent any
   options { //Mantener artefactos y salida de consola para el # específico de ejecuciones recientes del Pipeline.  
      buildDiscarder(logRotator(numToKeepStr: '3')) //No permitir ejecuciones concurrentes de Pipeline  
      disableConcurrentBuilds()
   }
   tools {
      jdk 'JDK8_Centos' //Preinstalada en la Configuración del Master     
      gradle 'Gradle4.5_Centos' //Preinstalada en la Configuración del Master   } 
      //Aquí comienzan los “items” del Pipeline
   }
  stages {
                        stage('Checkout') {
                            steps{
                            echo "------------>Checkout<------------"
                            checkout([
                            $class: 'GitSCM',
                            branches: [[name: '*/master']],
                            doGenerateSubmoduleConfigurations: false,
                            extensions: [],
                            gitTool: 'Git_Centos',
                            submoduleCfg: [],
                            userRemoteConfigs: [[
                            credentialsId: 'GitHub_daniel-castro97',
                            url:'https://github.com/daniel-castro97/alquielerMotos.git'
                            ]]
                            ])
                            }
                        }
                        stage('Build project') {
                           steps {
                              sh '​gradle​ --b ​./alquielerMotos/build.gradle clean compileJava​'
                              sh '​gradle​ --b ​./alquielerMotos/build.gradle build'
                           }
                        }
                        stage('Compile & Unit Tests') {
                        steps{
                        echo "------------>Unit Tests<------------"
                        sh '​gradle --b ./build.gradle test​' 
                      }
}
                        
         }
}