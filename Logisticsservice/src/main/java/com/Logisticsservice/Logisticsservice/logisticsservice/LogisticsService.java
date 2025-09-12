/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Logisticsservice.Logisticsservice.logisticsservice;

/**
 *
 * @author ABu_Alkhel
 */


import com.Logisticsservice.Logisticsservice.VO.Finance;
import com.Logisticsservice.Logisticsservice.models.Logistics;
import com.Logisticsservice.Logisticsservice.repositoryLogistics.LogisticsRepository;
//import com.logisticsservice.logisticsservice.repository.LogisticsRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LogisticsService {

    private final LogisticsRepository repository;
    private final RestTemplate restTemplate;

    public LogisticsService(LogisticsRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public Logistics createShipment(Logistics logistics) {

        Finance finance = restTemplate.getForObject(
                "http://FINANCESERVICE/api/finance/" + logistics.getFinanceId(), Finance.class);

        if (finance != null && finance.getRemaining() >= logistics.getCost()) {

            finance.setRemaining(finance.getRemaining() - logistics.getCost());
            restTemplate.put("http://FINANCESERVICE/api/finance/updateRemaining", finance);

            return repository.save(logistics);
        } else {
            throw new RuntimeException("Not enough funds for this shipment");
        }
    }

    public List<Logistics> getAll() {
        return repository.findAll();
    }
}
