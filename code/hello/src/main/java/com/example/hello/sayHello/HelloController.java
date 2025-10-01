package com.example.hello_api;

import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class SimpleController {

        @GetMapping("/hello")
        public Map<String, Object> sayHello(){

                return Map.of(
                                "message", "Hello, World!",
                                "timestamp", System.currentTimeMillis(),
                                "koreaTime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
                             );
        }
}  