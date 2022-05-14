package com.example.read_data.controllers;


import com.example.read_data.data.MarksDAO;
import com.example.read_data.model.Marks;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marks")
public class MarksController {
private final MarksDAO marksDAO;

    public MarksController(MarksDAO marksDAO) {
        this.marksDAO = marksDAO;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Marks create( Marks marks) {
        return marksDAO.add(marks);
    }


    @GetMapping("/all-details/{courseName}")
    public List<Object> CourseMarks(@PathVariable String courseName) {
        List<Marks> coursesData = marksDAO.getMarkByCourse(courseName);
        System.out.println("frs "+coursesData);
        MarksDetails marksDetails=new MarksDetails();
        return marksDetails.getDetails(coursesData);
    }
}
