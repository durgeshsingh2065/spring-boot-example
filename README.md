# Spring Boot Example Project

This is a sample Java / Maven / Spring Boot (version 2.5.3) application that can be used as a starter for creating a spring boot project. I hope it helps you.

## How to Run 

This application is packaged as a jar.

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar target/spring-boot-example-1.0.0.jar
or
        mvn spring-boot:run
```
Once the application runs you should see something like this

```
2021-08-09 12:50:59.285  INFO 20936 --- [           main] c.d.api.SpringBootExampleApplication     : No active profile set, falling back to default profiles: default
2021-08-09 12:51:00.278  INFO 20936 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8090 (http)
2021-08-09 12:51:00.291  INFO 20936 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-08-09 12:51:00.870  INFO 20936 --- [           main] c.d.api.SpringBootExampleApplication     : Started SpringBootExampleApplication in 2.16 seconds (JVM running for 2.589)

```

## About the Service

The service is just a simple rest call to get all employee.
```com.durgesh.api.EmpoyeeController``` on **port 8090**. (see below)

Here a simple endpoints you can call:

### Get all employee information.

```
http://localhost:8090/api/allEmployee
```

# Questions and Comments: durgeshsingh2065@gmail.com


