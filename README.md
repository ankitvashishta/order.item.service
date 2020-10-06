# order.item.service
Order Item Service

This is a maven module - a spring boot application, compiled with Java 11.

In the project directory, you can run:  `mvn clean install`
Compiles the project and downloads the dependencies.

Run the main class - com.ankit.order.service.OrderApplication as a  `Java Application`
Open [http://localhost:8070/swagger-ui.html#](http://localhost:8070/swagger-ui.html#) to view the swagger endpoint access in the browser.

The application is accessed through a Feign Client by other microservice -  `order.service`

The H2 database is configured with the application and can be accessed in the browser.
Open [http://localhost:8070/h2-console/](http://localhost:8070/h2-console/) to access the database.


The microservice is enable to work as a `Eureka Client` for a `Eureka Server` to be found at https://github.com/ankitvashishta/spring.boot.eureka.server 

### Eureka Client
Eureka Client is any microservice enabled to be registered with the `Eureka Server`

For the @SpringBootApplication to be discovery-aware, we include `spring-cloud-starter-netflix-eureka-client` into our classpath.

Then we can annotate the application with either `@EnableDiscoveryClient` or `@EnableEurekaClient`.<br>
This annotation is optional if we have the `spring-cloud-starter-netflix-eureka-client` dependency on the classpath.
