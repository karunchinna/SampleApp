# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="karunb.chinna@gmail.com"


# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/SpringBootSampleApp-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
COPY ${JAR_FILE} SpringBootSampleApp.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/SpringBootSampleApp.jar"]