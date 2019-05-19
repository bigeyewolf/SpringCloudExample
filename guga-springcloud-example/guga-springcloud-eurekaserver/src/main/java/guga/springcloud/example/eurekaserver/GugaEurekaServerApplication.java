package guga.springcloud.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer
 */
@EnableEurekaServer
@SpringBootApplication
public class GugaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GugaEurekaServerApplication.class, args);
    }

}
