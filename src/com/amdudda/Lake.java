package com.amdudda;

import java.util.ArrayList;

/**
 * Created by amdudda on 10/3/15.
 */
public class Lake {
    // stores the times taken to run around various lakes

    // attributes of Lake object
    private String name;
    private ArrayList<Double> times;

    // TODO: Decide whether constructor is needed for this implementation

    // getter for name and times and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTimes() {
        return times;
    }

    public void addTime(Double time) {
        // adds a time to the times arraylist
        this.times.add(time);
    }
}
