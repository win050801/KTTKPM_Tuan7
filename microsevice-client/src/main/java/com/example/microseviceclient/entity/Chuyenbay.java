package com.example.microseviceclient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Time;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Chuyenbay {


    private String maCB;

    private String gaDi;

    private String gaDen;

    private int doDai;

    private Time gioDi;

    private Time gioDen;

    private int chiPhi;

}
