package com.busproject.bus_registration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CusController {

    @GetMapping("/show")
    public String show(){
        return "Bhartendu";
    }
}
