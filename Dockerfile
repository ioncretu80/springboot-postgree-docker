FROM openjdk:19
ADD target/springboot-postgree-docker.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]