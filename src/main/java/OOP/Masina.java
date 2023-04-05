package OOP;

public class Masina {

    public int horsePower = 50;
    public String model = "Sedan";
    public boolean streatLegal = false;
    public long vinCode;

    public Masina() {
        //Constructor fara parametri
    }

    public Masina(int horsePower, String model, boolean streatLegal, long vinCode) {
        this.horsePower = horsePower;
        this.model = model;
        this.streatLegal = streatLegal;
        this.vinCode = vinCode;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStreatLegal() {
        return streatLegal;
    }

    public void setStreatLegal(boolean streatLegal) {
        this.streatLegal = streatLegal;
    }

    public long getVinCode() {
        return vinCode;
    }

    public void setVinCode(long vinCode) {
        this.vinCode = vinCode;
    }
}
