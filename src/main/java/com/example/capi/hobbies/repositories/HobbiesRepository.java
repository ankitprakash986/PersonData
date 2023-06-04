package com.example.capi.hobbies.repositories;

import com.example.capi.hobbies.entities.Hobbies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbiesRepository extends JpaRepository<Hobbies,Long> {
    public List<Hobbies> getByName(String name);
}
