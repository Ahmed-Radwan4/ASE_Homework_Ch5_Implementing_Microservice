/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Logisticsservice.Logisticsservice.VO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Finance {

    private Long id;
    private String description;
    private double amount;
    private double remaining;
    private String type;
}
