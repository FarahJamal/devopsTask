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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAvg() {
        return avg;
    }

    public void setAvg(long avg) {
        this.avg = avg;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMedian() {
        return median;
    }

    public void setMedian(long median) {
        this.median = median;
    }

    public Marks(String id, long avg, long max, long min, long median) {
        this.id = id;
        this.avg = avg;
        this.max = max;
        this.min = min;
        this.median = median;
    }
}