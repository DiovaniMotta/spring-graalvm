package com.diovanimotta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diovanimotta.domain.model.ClientModel;
import com.diovanimotta.service.ClientService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/api/clients")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping
    public List<ClientModel> list() {
        return service.findAll();
    }
}
