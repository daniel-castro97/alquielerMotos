pipeline{
    agent {
      label 'Slave_Induccion'
   }
   options { //Mantener artefactos y salida de consola para el # específico de ejecuciones recientes del Pipeline.  
      buildDiscarder(logRotator(numToKeepStr: '3')) //No permitir ejecuciones concurrentes de Pipeline  
      disableConcurrentBuilds()
   }
   tools {
      jdk 'JDK8_Centos' //Preinstalada en la Configuración del Master     
      gradle 'Gradle4.5_Centos' //Preinstalada en la Configuración del Master   } 
      //Aquí comienzan los “items” del Pipeline
   }
}