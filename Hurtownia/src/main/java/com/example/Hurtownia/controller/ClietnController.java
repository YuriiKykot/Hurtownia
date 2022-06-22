package com.example.Hurtownia.controller;

import com.example.Hurtownia.entity.Client;
import com.example.Hurtownia.entity.Firm;
import com.example.Hurtownia.entity.IndividualClient;
import com.example.Hurtownia.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClietnController {
    @Autowired
    ClientService clientService;

    @PostMapping("/addFirm")
    public Client addFirm(@RequestBody Firm client){
        return clientService.addClient(client);
    }

    @PostMapping("/addClient")
    public Client addClient(@RequestBody IndividualClient client){
        return clientService.addClient(client);
    }
}
