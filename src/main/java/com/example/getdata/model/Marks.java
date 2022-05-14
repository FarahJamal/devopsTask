package com.example.getdata.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("marksDetails")
public class Marks {

    @Id
    private String id;

    private long avg;
    private long max;
    private long min;
    private long median;


    public Marks(String id, long avg, long max, long min, long median) {
        this.id = id;
        this.avg = avg;
        this.max = max;
        this.min = min;
        this.median = median;
    }
}