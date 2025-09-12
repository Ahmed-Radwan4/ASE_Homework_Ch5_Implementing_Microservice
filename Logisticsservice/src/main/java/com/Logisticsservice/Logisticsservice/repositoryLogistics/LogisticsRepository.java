/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Logisticsservice.Logisticsservice.repositoryLogistics;

import com.Logisticsservice.Logisticsservice.models.Logistics;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ABu_Alkhel
 */
public interface LogisticsRepository extends JpaRepository<Logistics, Long>{
    
}
