package com.ids.backchargeous.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


//여기서 이제 엔드포인트 기반 api 설계하는 곳 페이지 컨트롤러는 따로 만들듯? 걍 여기 해도되고 ㅇㅇ


@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from Spring Boot! 🚀");
    }
}
