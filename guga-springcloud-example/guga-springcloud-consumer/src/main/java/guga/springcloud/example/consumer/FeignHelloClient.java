package guga.springcloud.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("guga-provider")
public interface FeignHelloClient {

    @GetMapping("/hello")
    String hello();

}
