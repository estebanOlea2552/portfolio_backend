FROM openjdk:17-jdk-alpine

MAINTAINER esteban

COPY target/portfolio_backend-0.0.1-SNAPSHOT.jar portfolio_backend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfolio_backend-0.0.1-SNAPSHOT.jar"]