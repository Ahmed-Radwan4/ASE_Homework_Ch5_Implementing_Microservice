/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Logisticsservice.Logisticsservice.VO;

/**
 *
 * @author ABu_Alkhel
 */
 
import com.Logisticsservice.Logisticsservice.models.Logistics;
 import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Logistics logistics;
    private Finance finance;
}
