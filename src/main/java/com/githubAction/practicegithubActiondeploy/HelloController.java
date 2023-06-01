package com.githubAction.practicegithubActiondeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String hello(){
        return "i.m so tired and exhausted but i'll be a good programmer";
    }
}
