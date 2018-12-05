package io.anymobi.springbootsecuritystarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello" ;
    }

    @GetMapping("/my")
    public String my(){

        return "my";
    }


}
