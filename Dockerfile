FROM openjdk:17
EXPOSE 8082
COPY target/springbootimagegitactions.jar /springbootimagegitactions.jar
ENTRYPOINT ["java","-jar","/springbootimagegitactions.jar"]
