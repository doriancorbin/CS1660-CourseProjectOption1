# CS1660-CourseProjectOption1

Images Used:
- Apache Spark: bitnami/spark
- Apache Hadoop: bde2020/hadoop-namenode & bde2020/hadoop-datanode
- Jupyter Notebook: jupyter/datascience-notebook
- SonarQube/SonarScanner: sonarqube


Steps for packaging/deploying/exposing MAIN APPLICATION (using Spring Boot)

1. ./mvnw -DskipTests package

2. ./mvnw -DskipTests com.google.cloud.tools:jib-maven-plugin:build \
  -Dimage=gcr.io/$GOOGLE_CLOUD_PROJECT/mainapp:v1
  
3. kubectl create deployment mainapp \
  --image=gcr.io/$GOOGLE_CLOUD_PROJECT/mainapp:v1
  
4. kubectl expose deployment mainapp --name=mainapp-service --type=LoadBalancer --port 80 --target-port 8080


Steps for JUPYTER NOTEBOOK

1. docker pull jupyter/datascience-notebook
2. kubectl create deployment jupyter --image=jupyter/datascience-notebook:latest
3. kubectl expose deployment jupyter --name=jupyter-service --type=LoadBalancer --port 80 --target-port 8888

Steps for Apache Spark

1. docker pull bitnami/spark
2. kubectl create deployment spark --image=bitnami/spark:latest
3. kubectl expose deployment spark --name=spark-service --type=LoadBalancer --port 80 --target-port 8080

Steps for SonarQube

1. docker pull sonarqube
2. kubectl create deployment sonarqube --image=sonarqube:latest
3. kubectl expose deployment sonarqube --name=sonarqube-service --type=LoadBalancer --port 80 --target-port 9000

Steps for Hadoop Namenode/Datanode

1. docker pull bde2020/hadoop-namenode  bde2020/hadoop-datanode
2. kubectl create deployment sonarqube --image=sonarqube:latest
3. kubectl expose deployment sonarqube --name=sonarqube-service --type=LoadBalancer --port 80 --target-port 9000
  

EXTERNAL REFERENCES:
https://codelabs.developers.google.com/codelabs/cloud-springboot-kubernetes#7
https://github.com/big-data-europe/docker-hadoop
https://cloud.google.com/kubernetes-engine/docs/how-to/exposing-apps

