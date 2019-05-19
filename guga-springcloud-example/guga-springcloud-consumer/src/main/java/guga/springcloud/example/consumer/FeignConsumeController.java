package guga.springcloud.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign消费者
 * 
 * @author bigeyewolf@163.com
 *
 */
@RestController
public class FeignConsumeController {

    @Autowired
    private FeignHelloClient helloClient;

    @GetMapping(value = "/hello_feign")
    public String hello() {
        return helloClient.hello();
    }

}
