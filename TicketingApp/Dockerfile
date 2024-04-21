# Use OpenJDK 17 as the base image
FROM openjdk:17

Create the directory /APP
RUN mkdir -p /APP

Set the working directory to /APP
WORKDIR /APP

Copy the WebApp.jar file from the target directory into the container's /APP directory
COPY TicketingApp/target/Ticketing.jar /APP


Define the command to run the application
ENTRYPOINT ["java", "-jar", "Ticketing.jar"]