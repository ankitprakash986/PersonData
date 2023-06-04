package com.example.capi.hobbies.controller;

import com.example.capi.hobbies.entities.Hobbies;
import com.example.capi.hobbies.services.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbiesController {

    @Autowired
    public HobbiesService hobbiesService;
    @GetMapping("/ping")
    public ResponseEntity<String> ping (){
        return ResponseEntity.ok("I m Working.");
    }

    @GetMapping("/hobbies/{name}")
    public ResponseEntity<List<Hobbies>> getHobbies(@PathVariable("name") String name){
        return ResponseEntity.ok(hobbiesService.getHobbies(name));
    }

    @GetMapping("/hobbies")
    public ResponseEntity<List<Hobbies>> getHobbiesRequestParam(@RequestParam String name){
        return ResponseEntity.ok(hobbiesService.getHobbies(name));
    }

}
