package com.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Andrew on 10/21/2015.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello (Model model) {

        model.addAttribute("greeting", "Hello World");

        return "hello";
    }

}
