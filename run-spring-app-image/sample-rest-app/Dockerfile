FROM openjdk:8
ADD target/docker-spring-app.jar  docker-spring-app.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "docker-spring-app.jar"]
