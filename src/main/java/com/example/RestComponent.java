package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yannis on 8/03/17.
 */
@RestController
public class RestComponent {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

}
