package com.example.microseviceclient.entity;

import lombok.*;



//import javax.persistence.Entity;
//import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String username;
    private String password;

}
