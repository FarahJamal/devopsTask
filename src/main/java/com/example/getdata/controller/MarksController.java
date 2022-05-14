package com.example.getdata.controller;

import java.util.List;

import com.example.getdata.model.Marks;
import com.example.getdata.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class MarksController {

    @Autowired
    private MarksRepository marksRepository;

    @GetMapping("/employees")
    public List <Marks> getAll() {
        return marksRepository.findAll();
    }


}