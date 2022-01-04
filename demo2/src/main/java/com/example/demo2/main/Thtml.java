package com.example.demo2.main;


import jdk.nashorn.internal.runtime.Undefined;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Thtml {
    @RequestMapping("/table")
    String totable(){
        return "table.html";
    }
}
