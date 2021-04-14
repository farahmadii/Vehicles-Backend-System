# Pricing Service

The Pricing Service is a REST WebService that simulates a backend that
would store and retrieve the price of a vehicle given a vehicle id as
input. In this project, it is also converted to a microservice.


## Features

- REST WebService integrated with Spring Boot
- Microservice registered to a netflix eureka server

#### Run the code

To run this service you execute:

```
$ mvn clean package
```

```
$ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar
```

It can also be imported in your IDE as a Maven project.
