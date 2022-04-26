FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

## $ docker build -t wordservice:latest .
## $ docker run -dp 8080:8080 wordservice