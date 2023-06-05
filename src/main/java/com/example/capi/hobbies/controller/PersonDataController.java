package com.example.capi.hobbies.controller;

import com.example.capi.hobbies.services.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDataController {

@GetMapping("/ping")
    public String ping(){
    return "I m working !";
}
}
