package pl.dominisz.springbootdemo;

/**
 * http://dominisz.pl
 * 19.05.2019
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
