package com.example.microservicelogin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
@Getter
@Setter
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private String username;

    private String password;





}
