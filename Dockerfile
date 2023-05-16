FROM amazoncorretto:8-alpine-jdk

MAINTAINER esteban

COPY target/portfolio_backend-0.0.1-SNAPSHOT portfolio_backend-0.0.1-SNAPSHOT

ENTRYPOINT ["java","-jar","/portfolio_backend-0.0.1-SNAPSHOT"]