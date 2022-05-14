package com.example.read_data.data;

import com.example.read_data.model.Marks;

import java.util.List;


public interface MarksDAO {

    Marks add(Marks marks);
    List<Marks> getMarkByCourse(String courseName);


}
