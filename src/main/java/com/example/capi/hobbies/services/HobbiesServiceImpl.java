package com.example.capi.hobbies.services;

import com.example.capi.hobbies.entities.Hobbies;
import com.example.capi.hobbies.repositories.HobbiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbiesServiceImpl implements HobbiesService {
    @Autowired
    public HobbiesRepository hobbiesRepository;

    @Override
    public List<Hobbies> getHobbies(String name) {

        return hobbiesRepository.getByName(name);


    }
}
