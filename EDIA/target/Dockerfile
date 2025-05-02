# Fase de construcción - Usamos Amazon Corretto para Maven
FROM amazoncorretto:17-alpine AS build
WORKDIR /EDIA

# Instalamos Maven manualmente (versión compatible)
RUN apk add --no-cache maven

# 1. Copia solo el POM primero para cachear dependencias
COPY pom.xml .
# Descarga dependencias (se cachea si el POM no cambia)
RUN mvn dependency:go-offline -B

# 2. Copia el código fuente
COPY src ./src

# 3. Empaqueta la aplicación
RUN mvn clean package -DskipTests -B

# Fase de ejecución
FROM amazoncorretto:17-alpine-jdk
WORKDIR /EDIA

# Copia el JAR (verifica el nombre exacto en tu target/)
COPY --from=build /EDIA/target/EDIA-0.0.1-SNAPSHOT.jar app.jar

# Puerto expuesto (ajusta según tu aplicación)
EXPOSE 8083

ENTRYPOINT ["java", "-jar", "app.jar"]