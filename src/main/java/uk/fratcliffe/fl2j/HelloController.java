package uk.fratcliffe.fl2j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/Andy")
    public String andy() {
        return "Hello Andy";
    }
    @RequestMapping("/Hello")
    public String hello(@RequestParam String name) {
        return "Hello "+name;
    }
}
