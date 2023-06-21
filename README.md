# Calculator Web Application

This is a simple calculator web application built using the Spring Boot framework. It allows users to perform basic arithmetic calculations such as addition, subtraction, multiplication, and division.

## Prerequisites

Before running this application, ensure that you have the following prerequisites installed:

- Java Development Kit (JDK) 11 or higher
- Apache Maven

## Getting Started

To get started with the calculator web application, follow these steps:

1. Clone the repository:

  **git clone <repository_url>**

3. Build the application using Maven:

  **mvn clean install**

3. Run the application:

  **mvn spring-boot:run**

4. Access the application in your web browser:

  **http://localhost:8080**

How to Create a Docker Image

    Install Docker on your machine following the official Docker documentation for your operating system.

    Clone this repository and navigate to the project directory as described in the previous section.

    Build the Docker image:

    **docker build -t calculator-app .**

    Run the Docker container:

    **docker run -d -p 8080:8080 calculator-app**

    Open your web browser and access the game at http://localhost:8080.
   
   
