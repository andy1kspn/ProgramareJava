package io.spinu.pack;

public class Volkswagen {
    public String model;
    public int year;
    public long numberPlate;

    public Volkswagen() {
        //Constructor gol
    }

    public Volkswagen(String model, int year, long numberPlate) {
        this.model = model;
        this.year = year;
        this.numberPlate = numberPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(long numberPlate) {
        this.numberPlate = numberPlate;
    }
}
