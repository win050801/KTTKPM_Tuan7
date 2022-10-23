package com.example.microseviceclient.controller;

import com.example.microseviceclient.entity.Chuyenbay;
import com.example.microseviceclient.entity.Maybay;
import com.example.microseviceclient.entity.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
    @GetMapping("/getUser1")
    public User getUser1()
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:3000/getUser",User.class);
    }
    @PostMapping("/login")
    public String ligin(@RequestBody User user)
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:3000/login",user,String.class);
    }
    @PostMapping("/register")
    public User register(@RequestBody User user)
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:3000/register",user,User.class);
    }
    @GetMapping("/getchuyenBay")
    List<Chuyenbay> getMayBay()
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8081/getDAD",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Chuyenbay>>() {}
        ).getBody();
    }



}
