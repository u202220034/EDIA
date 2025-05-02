FROM maven:3.9.5-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
COPY --from=build /app/target/EDIA-0.0.1-SNAPSHOT.jar /EDIA-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/EDIA-0.0.1-SNAPSHOT.jar"]