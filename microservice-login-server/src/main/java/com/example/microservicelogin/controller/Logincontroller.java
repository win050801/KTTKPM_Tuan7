package com.example.microservicelogin.controller;

import com.example.microservicelogin.entity.User;
import com.example.microservicelogin.respository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
//import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logincontroller {
    @Autowired
    Repository repository;
//    @RequestMapping("/")
//    public String checkMVC(){
//        return "login";
//    }
    @PostMapping("/register")
    public User register(@RequestBody User user)
    {
        repository.save(user);
        return user;
    }

    @PostMapping("/login")
    public String Login(@RequestBody User user){
        User user1 =  repository.findByUsername(user.getUsername());
        if(user1!=null&&user1.getPassword().equals(user.getPassword()))
        {
            return "Thanh cong";
        }
        else {
            return "That bai";
        }
    }

    @GetMapping("/getUser")
    public User getUser()
    {
        return  repository.findByUsername("Thang");
    }




//    @GetMapping("/getUser1")
//    public User getUser1()
//    {
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("http://localhost:3000/getUser",User.class);
//    }





}
