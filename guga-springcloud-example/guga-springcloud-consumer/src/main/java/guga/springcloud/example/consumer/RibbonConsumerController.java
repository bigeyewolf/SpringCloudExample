package guga.springcloud.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonConsumerController {

    private static final String PROVIDER_NAME = "guga-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return this.restTemplate.getForEntity("http://" + PROVIDER_NAME + "/hello", String.class).getBody();
    }

}
