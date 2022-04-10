package io.israel.springboot.Controllers;

import io.israel.springboot.Random.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }

    @RequestMapping("/Topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("JavaScript", "JavaScript Description", "JavaScript Description")
        );
    }

}
