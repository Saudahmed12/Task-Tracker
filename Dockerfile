# Build stage - Copy Maven files FIRST
FROM eclipse-temurin:17-jdk-jammy AS builder
WORKDIR /app

# Copy Maven wrapper, pom.xml, .mvn for caching
COPY mvnw pom.xml ./
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline -B

# Copy source code and build
COPY src src
RUN ./mvnw clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy ANY generated JAR (handles version changes)
COPY --from=builder /app/target/*.jar app.jar

# Render requires port 8080
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
