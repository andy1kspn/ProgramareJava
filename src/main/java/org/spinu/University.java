package org.spinu;

public class University {
    public String name;
    public Integer year;
    public String location;


    public University() {
        //Fara parametru
    }

    public University(String name, int year, String location) {
        this.name = name;
        this.year = year;
        this.location = location;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




    int calculate(int x, int y){
        return x + y;
    }


    float calculate(float a, float b){

        return a / b;


    }





}
