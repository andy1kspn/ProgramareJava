package OOP;

public class Toyota extends Masina {
    public String engineCode = "unknown";

    public Toyota() {
        //Constructor fara parametri
    }

    public Toyota(int horsePower, String model, boolean streatLegal, long vinCode, String engineCode) {
        super(horsePower, model, streatLegal, vinCode);
        this.engineCode = engineCode;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }
}
