package com.example.microseviceclient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Employee {

    private long EmployeeID;

    private String firstName;

    private  String lastName;

    private String email;

}
