FROM openjdk:17
EXPOSE 8082
ADD target/springbootimagegitactions.jar target/springbootimagegitactions.jar
ENTRYPOINT ["java","-jar","/springbootimagegitactions.jar"]