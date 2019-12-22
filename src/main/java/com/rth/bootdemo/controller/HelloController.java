package com.rth.bootdemo.controller;


import com.rth.bootdemo.model.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String hello() {

        Article article = new Article(1L,"Tom");
        article.setAuthor("tom");

        return "hello world";
    }

}