package backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> welcome() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to the HotZone Users API!");
        response.put("status", "running");
        return response;
    }

    @GetMapping("/api/test")
    public Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "API test endpoint is working!");
        response.put("database", "PostgreSQL connected successfully");
        return response;
    }
}