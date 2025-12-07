FROM maven:4.0.0-openjdk-21 AS build
COPY . .
RUN ./mvnw clean install

#
# Package stage
#
FROM eclipse-temurin:21-jdk
COPY --from=build /target/Tasks-0.0.1-SNAPSHOT.jar app.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
