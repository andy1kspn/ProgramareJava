package org.spinu;

public class Student implements Human{

    private String name;
    private String prenume;
    private Integer year;
    private byte nivel;
    private String location;


    public Student() {
        //Nothing

    }

    public Student(String name, String prenume, Integer year, byte nivel, String location) {
        this.name = name;
        this.prenume = prenume;
        this.year = year;
        this.nivel = nivel;
        this.location = location;
    }






    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void go() {

    }

    @Override
    public void eat() {

    }
}
