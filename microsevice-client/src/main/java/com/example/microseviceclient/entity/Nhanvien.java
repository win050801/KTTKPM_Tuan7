package com.example.microseviceclient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Nhanvien {

    private String maNV;

    private String tenNV;

    private double luong;
}
