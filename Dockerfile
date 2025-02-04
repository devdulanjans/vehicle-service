# # Use an official OpenJDK runtime as a parent image
# FROM openjdk:17-jdk-slim
#
# # Set the working directory inside the container
# WORKDIR /app
#
# # Copy the Maven build file to the container
# COPY target/vehicle-service.jar app.jar
#
# # Expose the application's port
# EXPOSE 8080
#
# # Run the application
# CMD ["java", "-jar", "app.jar"]

#
# Build stage
#
FROM maven:3.9.2 AS build
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17-jdk-alpine
WORKDIR /home/application
COPY --from=build  /home/app/target/*.jar /home/application/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/application/app.jar"]
