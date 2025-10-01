package main.java.com.example.hello.sayHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello() {
        ZonedDateTime nowKst = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        return new HelloResponse(
                nowKst.toString(),            
                System.currentTimeMillis(),  
                "Hello, World!"
        );
    }

    public record HelloResponse(String koreaTime, long timestamp, String message) {}
}