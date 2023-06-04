package com.example.capi.hobbies.services;

import com.example.capi.hobbies.entities.Hobbies;

import java.util.List;

public interface HobbiesService {
    List<Hobbies> getHobbies(String name);
}
