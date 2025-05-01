FROM amazoncorretto:17-alpine-jdk
EXPOSE 8080
COPY EDIA/target/EDIA-0.0.1-SNAPSHOT.jar /api-v1.jar

ENTRYPOINT ["java","-jar","/api-v1.jar"]