# Use a base image with Java 11 or later
FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=./target/*.jar

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the Maven build output directory to the container
COPY ${JAR_FILE} .

# Expose any necessary ports (if your application requires it)
EXPOSE 8080

# Set the entry point and command to run your application
ENTRYPOINT ["java", "-jar", "calculatorwebapp-*.jar"]
