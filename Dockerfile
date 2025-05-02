FROM openjdk:17
COPY "./EDIA/target/EDIA-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 5432
ENTRYPOINT [ "java", "-jar", "app.jar"]