package com.example.Hurtownia.controller;

import com.example.Hurtownia.entity.Deliverer;
import com.example.Hurtownia.service.DelivererService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DelivererController {
    @Autowired
    DelivererService delivererService;

    @PostMapping("/addDeliverer")
    public Deliverer addDeliverer(@RequestBody Deliverer deliverer){
        return delivererService.addDeliverer(deliverer);
    }

    @GetMapping("/addOrder/{idDeliverer}/{idOrder}")
    public void addOrder(@PathVariable String idDeliverer,@PathVariable String idOrder){
        delivererService.addOrder(idDeliverer, idOrder);
    }

    @GetMapping("/all")
    public List<Deliverer> getAll(){
        return delivererService.getAllDeliverersFree();
    }

    @GetMapping("/All")
    public List<Deliverer> getAllDev(){
        return delivererService.getAll();
    }
}
