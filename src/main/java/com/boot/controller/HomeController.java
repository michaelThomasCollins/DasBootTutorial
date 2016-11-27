package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 26/11/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "You Found Me!";
    }
}
