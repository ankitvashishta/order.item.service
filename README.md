# order.item.service
Order Item Service

### Configurations added to the pom.xml file
<b>com.h2database</b> - Dependency added for an in memory H2 database. The database properties are added to the `application.properties` file. Any SQL scripts are added to the `data.sql` file.<br>
<b>netflix-eureka-client</b> - This dependency registers the service as a Eureka Client. The server address is added to the `application.properties` file.<br/>

### To run the service
This is a maven module - a spring boot application, compiled with Java 11.<br/>
In the project directory, you can run:  `mvn clean install` - compiles the project and downloads the dependencies.<br/>

Run the main class - com.ankit.order.service.OrderApplication as a  `Java Application`
Open [http://localhost:8070/swagger-ui.html#](http://localhost:8070/swagger-ui.html#) to view the swagger endpoint access in the browser.<br/>

The H2 database is configured with the application and can be accessed in the browser at : [http://localhost:8070/h2-console/](http://localhost:8070/h2-console/) <br/>
The microservice is enabled to work as a `Eureka Client` for a `Eureka Server` to be found at : https://github.com/ankitvashishta/spring.boot.eureka.server 

### Eureka Client
Eureka Client is any microservice enabled to be registered with the `Eureka Server`<br/>
For the @SpringBootApplication to be discovery-aware, we include `spring-cloud-starter-netflix-eureka-client` into our classpath.<br/>
Then we can annotate the application with either `@EnableDiscoveryClient` or `@EnableEurekaClient`.<br>
This annotation is optional if we have the `spring-cloud-starter-netflix-eureka-client` dependency on the classpath.
