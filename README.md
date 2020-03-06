# Helmes Homework

Test solution for access to practice. Done by Dmitri Petrussevits.

## Database info

- User: admin
- Password: admin

## Tasks

- 1. Correct all of the deficiencies in index.html

- 2. "Sectors" selectbox:
- 2.1. Add all the entries from the "Sectors" selectbox to database
- 2.2. Compose the "Sectors" selectbox using data from database

- 3. Perform the following activities after the "Save" button has been pressed: 
- 3.1. Validate all input data (all fields are mandatory)
- 3.2. Store all input data to database (Name, Sectors, Agree to terms)
- 3.3. Refill the form using stored data 
- 3.4. Allow the user to edit his/her own data during the session

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[MySQL](https://www.mysql.com/) - Open-Source Relational Database Management System
* 	[Thymeleaf](https://www.thymeleaf.org/) - Modern server-side Java template engine for both web and standalone environments.

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `ee.dmipet90.helmes.homework.Application` class from your IDE.

- Download the zip.
- Unzip the zip file
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## packages

- `entity` — to hold our entities;
- `repository` — to communicate with the database;
- `service` — to hold our business logic;
- `controller` — to listen to the client;
- `exception` — to hold custom exceptions;
- `shared` — to hold additional classes like Utils etc.;

- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.properties` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.

- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies



