package itonics.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello from Spring Boot!";
    }

    @RequestMapping(value = "/hellos", method = RequestMethod.GET)
    public List<Hello> get_hellos() {
        return this.helloService.getHellos();
    }
}
