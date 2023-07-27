FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/springboot-kubernate-mysql-0.0.1-SNAPSHOT.jar springboot-kubernate-mysql.jar
ENTRYPOINT ["java","-jar","/springboot-kubernate-mysql.jar"]