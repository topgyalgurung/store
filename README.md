## Spring Boot Store App

### Overview

A Java Spring Boot application to explore key concepts in modern Java development, including REST API development, dependency injection, data persistence, and configuration management. This app demonstrates best practices in backend engineering using real-world tools like Maven, PostgreSQL, and Spring Data JPA.


### Learning 
- How Spring Boot manages objects and dependencies using IoC and annotations
- Connecting a Spring Boot app to a relational database (PostgreSQL)
- Managing app configuration using application.properties or YAML
- Building REST APIs using Spring Web and Spring MVC
- Working with Spring Data JPA, Repositories, and Hibernate ORM
- Understanding model-first vs. database-first workflows
- Using @Query, JPQL, native SQL, projections, and dynamic queries
- Implementing sorting, pagination, eager/lazy loading for performance
- Structuring Spring Boot projects with best practices
- Using Lombok to reduce boilerplate code


### Tech Stack
- Language: Java 17+
- Framework: Spring Boot 3.x
- Build Tool: Maven
- Database: PostgreSQL
- ORM: Hibernate with Spring Data JPA
- Utilities: Lombok, Spring DevTools
- IDE: IntelliJ IDEA

---

#### Getting Started

Creating the Project
- Option 1: start.spring.io
- Option 2: IntelliJ IDEA Spring Initializr

Project Structure
- src/main/java — Java source files
- StoreApplication.java — Main class (entry point)
- src/main/resources — Static assets and configuration
- application.properties — App configuration (port, DB, etc.)

Sample pom.xml Dependency (Spring Web)

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

### Running the App

- Check Maven version
```bash
./mvnw -v
```
- Run the app
``` bash
./mvnw spring-boot:run
```

----

### Development Highlights

Building REST APIs
- Annotate controllers with @RestController
- Map routes using @RequestMapping or @GetMapping, etc.

Dependency Injection
- Use @Service, @Repository, and @Component to register beans
- Inject dependencies via constructor injection (@Autowired optional)

```java
@Service
public class OrderService {
    private final PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
```

Configuration with application.properties
```java
server.port=8081
spring.application.name=store
app.page-size=10
```

Live Reload with Spring DevTools
```java
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>
```

Enable in IntelliJ:
- Preferences > Compiler > Build project automatically
- Advanced Settings > Enable auto-make when app is running

---

### Design Principles

- Decoupling via Interfaces
- Replace tightly coupled classes with interfaces and inject implementations using constructor injection.
- Open/Closed Principle (OOP): Design classes to be open for extension but closed for modification to improve maintainability.

---

### Debugging & Testing
- Use IntelliJ’s debugger with breakpoints
- Use @SpringBootTest for integration testing
- Write unit tests for services using Mockito

--- 

### Next Steps
- Add database integration using Spring Data JPA and PostgreSQL
- Implement controller logic to serve REST endpoints
- Add unit & integration tests
- Optimize performance with projections, pagination, and eager/lazy loading
