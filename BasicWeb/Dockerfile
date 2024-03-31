FROM openjdk:17
WORKDIR /APP
COPY  target/*.jar  app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar"]
EXPOSE 8081

