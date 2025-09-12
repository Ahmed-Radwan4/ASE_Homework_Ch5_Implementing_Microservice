/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Logisticsservice.Logisticsservice.controller;

/**
 *
 * @author ABu_Alkhel
 */

import com.Logisticsservice.Logisticsservice.logisticsservice.LogisticsService;
import com.Logisticsservice.Logisticsservice.models.Logistics;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logistics")
public class LogisticsController {

    private final LogisticsService service;

    public LogisticsController(LogisticsService service) {
        this.service = service;
    }

    @PostMapping
    public Logistics addShipment(@RequestBody Logistics logistics) {
        return service.createShipment(logistics);
    }

    @GetMapping
    public List<Logistics> getAll() {
        return service.getAll();
    }
}
