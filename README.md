# CS1660-CourseProjectOption1

Images Used:
-Apache Spark: bitnami/spark
-Apache Hadoop: bde2020/hadoop-namenode & bde2020/hadoop-datanode
-Jupyter Notebook:
-SonarQube/SonarScanner:


Steps for packaging/deploying/exposing main application (using Spring Boot)

1. ./mvnw -DskipTests package

2. ./mvnw -DskipTests com.google.cloud.tools:jib-maven-plugin:build \
  -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/mainapp:v1
  
3. kubectl create deployment mainapp \
  --image=gcr.io/$GOOGLE_CLOUD_PROJECT/mainapp:v1
  
4. kubectl expose deployment mainapp --name=mainapp-service --type=LoadBalancer --port 80 --target-port 8080


Steps for
  

EXTERNAL REFERENCES:
https://codelabs.developers.google.com/codelabs/cloud-springboot-kubernetes#7
https://github.com/big-data-europe/docker-hadoop
https://cloud.google.com/kubernetes-engine/docs/how-to/exposing-apps

