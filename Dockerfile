FROM openjdk:24
COPY "./EDIA/target/EDIA-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8083
ENTRYPOINT [ "java", "-jar", "app.jar"]