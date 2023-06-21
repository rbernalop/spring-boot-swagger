# Swagger API Documentation in Spring Boot

This is a sample project to demonstrate how to document a REST API with Swagger in Spring Boot.
Also it shows the basic configuration of Swagger main information and security with JWT.

## How to add Swagger to your project 📚

Just by adding the dependency `springdoc-openapi-starter-webmvc-ui` to your [pom.xml](pom.xml) file
Swagger will be added to your project and you will get access the [Swagger UI](http://localhost:8080/swagger-ui.html).

## Additonal configuration 🔒

You can configure the main information (API name, contact data...) in the 
[SwaggerLocalConfiguration](src/main/java/org/rbernalop/springbootswagger/SwaggerLocalConfiguration.java) file.
Also in this file you can find the setup for the JWT security.