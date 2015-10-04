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

    // Constructor
    public Lake(String lkName,Double firstTime) {
        this.name = lkName;
        this.times = new ArrayList<Double>();
        this.times.add(firstTime);
    } // end constructor

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

    protected Double getFastestTime() {
        // returns the fastest time for a lake
        if (this.times.isEmpty()) return 0d;  // in the unlikely event no times are stored
        Double minTime = this.times.get(0);
        for (Double t:this.times) {
            if (t<minTime) minTime = t;
        } // end for each
        return minTime;
    } //end getFastestTime

    protected String titleCase() {
        // returns a lake's name in title case
        // strip out excess white space
        String lk_name = this.name;
        // capitalize the first letter
        lk_name = lk_name.substring(0, 1).toUpperCase() + lk_name.substring(1);
        // loop: look for spaces and capitalize following letters.
        // We've already trimmed the string, so we don't need to worry about there being spaces at the end of the string.
        for (int i = 0; i < lk_name.length(); i++) {
            if (lk_name.substring(i, i + 1).equals(" ")) {
                lk_name = lk_name.substring(0, i + 1) + lk_name.substring(i + 1, i + 2).toUpperCase() + lk_name.substring(i + 2);
            } // end if
        } // end for
        return lk_name;
    } // end titleCase
}
