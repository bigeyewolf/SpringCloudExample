package guga.springcloud.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign客户端
 * 
 * @author bigeyewolf@163.com
 *
 */
@FeignClient("guga-provider")
public interface FeignHelloClient {

    @GetMapping("/hello")
    String hello();

}
