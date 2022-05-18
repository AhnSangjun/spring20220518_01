package com.its.people.service;

import com.its.people.dto.PeopleDTO;
import com.its.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    public void save(String name, int age) {
        System.out.println("PeopleService.save");
        peopleRepository.save(name, age);
    }

    public void save1(PeopleDTO peopleDTO) {
        peopleRepository.save1(peopleDTO);
    }

    public List<PeopleDTO> findAll() {
        List<PeopleDTO> peopleDTOList = peopleRepository.findAll();
    }
}
