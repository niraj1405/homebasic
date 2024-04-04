# Use OpenJDK 17 as the base image
FROM openjdk:17

# Create the directory /app
RUN mkdir -p /app

# Set the working directory to /app
WORKDIR /app

# Copy the Ticketing.jar file from the target directory into the container's /app directory
COPY TicketingApp/target/Ticketing.jar /app

# Define the command to run the application
CMD ["java", "-jar", "Ticketing.jar"]

# Expose the port that the application runs on (assuming it runs on port 8081)
EXPOSE 8081
