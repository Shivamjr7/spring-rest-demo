package com.shivam.springrest.springrestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class TestController {



    @GetMapping("/names")
    public List<String> getNames()
    {

        List<String> names = new ArrayList<>();
        names.add("Shivam");
        names.add("Mehandi");
        return names;
    }


  
}
