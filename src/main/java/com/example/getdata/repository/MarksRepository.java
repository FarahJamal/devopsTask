package com.example.getdata.repository;

import com.example.getdata.model.Marks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MarksRepository extends MongoRepository<Marks, String> {



    }
