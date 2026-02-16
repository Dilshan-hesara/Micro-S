package com.dilshanhesara.orderservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/details")
    public ResponseEntity<?> getDetails() {
        return new ResponseEntity<>("Inventory service is UP", HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<?> getHealth() {
        return new ResponseEntity<>("Health service is UP", HttpStatus.OK);
    }



    @GetMapping("/call-inventory")
    public ResponseEntity<?> callInventoryService() {
        String response = restTemplate.getForObject("http://Inventory-service/call-inventory", String.class);
        return new ResponseEntity<>("From order successfully"+ response, HttpStatus.OK);
    }
}