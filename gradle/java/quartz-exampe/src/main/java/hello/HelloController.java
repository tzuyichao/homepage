package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String index() {
        helloService.sayHello();
        return "Greetings from Spring Boot!";
    }
}
