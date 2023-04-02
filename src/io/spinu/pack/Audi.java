package io.spinu.pack;

public class Audi extends Volkswagen{
    public String pachet;

    public Audi() {
    }

    public Audi(String model, int year, long numberPlate, String pachet) {
        super(model, year, numberPlate);
        this.pachet = pachet;
    }

    public String getPachet() {
        return pachet;
    }

    public void setPachet(String pachet) {
        this.pachet = pachet;
    }
}
