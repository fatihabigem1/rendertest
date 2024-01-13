# Use a base image with JRE
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build context to the container
COPY ./testDriven.jar /app

# Specify the command to run your application
CMD ["java", "-jar", "testDriven.jar"]