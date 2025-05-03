FROM amazoncorretto:21-alpine-jdk
COPY "./target/EDIA-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8083
ENTRYPOINT [ "java", "-jar", "app.jar"]