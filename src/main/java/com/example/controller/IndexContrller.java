package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContrller {


    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String getUser(){
        return "get-user";
    }


    @RequestMapping(value = "user",method = RequestMethod.POST)
    public String postUser(){
        return "post-user";
    }

    @RequestMapping(value = "user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "delete-user";
    }

    @RequestMapping(value = "user",method = RequestMethod.PUT)
    public String putUser(){
        return "put-user";
    }
}
