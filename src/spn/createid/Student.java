package spn.createid;

public class Student {

    public String nume = "Nume";
    public String prenume = "Prenume";
    public String grupa = "IA2201";
    public byte varsta = 20;
    public int nrLucky = 24;


    public Student() {

    }

    public Student(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }


   /* public Student(String nume, String prenume, String grupa, byte varsta, int nrLucky) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.varsta = varsta;
        this.nrLucky = nrLucky;
    }

*/

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
/*
    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public byte getVarsta() {
        return varsta;
    }

    public void setVarsta(byte varsta) {
        this.varsta = varsta;
    }

    public int getNrLucky() {
        return nrLucky;
    }

    public void setNrLucky(int nrLucky) {
        this.nrLucky = nrLucky;
    }
    */

}
