package main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // serves for every HTTP request
    @RequestMapping("/hello")
    public String sayHello () {
        return "<h1>Hi</h1>";
    }

}
