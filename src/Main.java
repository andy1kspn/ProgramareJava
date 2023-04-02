import io.spinu.pack.Audi;
import io.spinu.pack.Calcule;
import io.spinu.pack.Volkswagen;

public class Main {
    public static void main(String[] args) {

        boolean streetLegal;

        Volkswagen passat = new Volkswagen("passat", 2010, 2003500L);

        System.out.println(passat.model);
        System.out.println(passat.year);
        System.out.println(passat.numberPlate);


        if(passat.year <= 2011){
            streetLegal = false;
        }else{
            streetLegal = true;
        }
        System.out.println("Masina este autorizata: " + streetLegal);


        Audi a7 = new Audi("A7", 2017, 2003501L, "STOCK");

        System.out.println(a7.model);
        System.out.println(a7.year);
        System.out.println(a7.numberPlate);
        System.out.println(a7.pachet);

        String test = (a7.year == 2017) ? "Adevarat" : "Fals";

        System.out.println(test);


        Calcule calcule = new Calcule();
        float result = calcule.calculateResult();





    }
}