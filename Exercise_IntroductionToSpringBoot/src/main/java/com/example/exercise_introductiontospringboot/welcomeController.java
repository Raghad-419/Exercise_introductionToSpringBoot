package com.example.exercise_introductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {

    @GetMapping("/name")
    public String name(){
        return "My name is Raghad";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 22";
    }

    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything  OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Raghad");
        names.add("Lama");
        names.add("Shatha");
        return names;
    }



}
