package guga.springcloud.example.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供者应用
 * 
 * @author bigeyewolf@163.com
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class GugaProviderApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home() {
        return "Hello springcloud, port:" + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(GugaProviderApplication.class, args);
    }

}
