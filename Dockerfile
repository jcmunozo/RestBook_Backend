FROM openjdk:17-jdk-alpine

COPY target/RestBook-0.0.1-SNAPSHOT.jar  restbook-java.jar

ENTRYPOINT ["java", "-jar", "restbook-java.jar"]
