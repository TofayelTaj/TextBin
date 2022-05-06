package com.practice.TextBin.Controllers;


import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }





}
