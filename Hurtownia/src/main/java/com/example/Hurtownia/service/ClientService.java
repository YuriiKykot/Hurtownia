package com.example.Hurtownia.service;

import com.example.Hurtownia.entity.Client;
import com.example.Hurtownia.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client addClient(Client client){
        return clientRepository.save(client);
    }
}
