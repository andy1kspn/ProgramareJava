import io.spinu.pack.Audi;
import io.spinu.pack.Calcule;
import io.spinu.pack.Volkswagen;
import spn.createid.Student;
import java.lang.Math;
import java.lang.String;
import java.util.Scanner;

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

        StringBuilder str = new StringBuilder("study");
        StringBuilder two = str.append("Java"); // Indica acelasi obiect ca si str!

        System.out.println(str); // studyJava
        System.out.println(two); // studyJava

        int lungimea = str.length();

        System.out.println("ABCDEFGH".toLowerCase());
        System.out.println("abcdefgh".toUpperCase());
        System.out.println("abcdefgh".charAt(5)); //Caracterul de pe pozitia 5
        System.out.println("abcdefgh".indexOf('c',4)); //-1 pentru ca de la pozitia 4 nu exista nici un c
        System.out.println("abcdefgh".substring(3,5));  //sirul cuprins intre 3 si 5

        boolean egal2 = two.equals("ABCDEFGH"); // false, deoarece ABCDEFGH != abcdefgh

       System.out.println("====================================================================================");
       System.out.println("Bine ati venit la inscrierea pentru olimpiada!");
       System.out.println("====================================================================================");

        Scanner numeAux = new Scanner(System.in);
        System.out.print("Va rugam sa introduceti numele dvs: ");
        String nume =  numeAux.nextLine();

        Scanner prenumeAux = new Scanner(System.in);
        System.out.print("Va rugam sa introduceti prenumele dvs: ");
        String prenume =  prenumeAux.nextLine();


        Student first = new Student(nume, prenume);
        System.out.println("Felicitari " + first.prenume + " " + first.nume + ", acum esti inscris!");

        System.out.println("====================================================================================");
        System.out.println("Alegeti o opriune: \n 1) Adunarea! \n 2) Scaderea! \n 3) Inmultirea! \n 4) Impartirea!  \n 5) Minimul dintre 2 numere! \n 6) Maximul dintre 2 numere! ");
        System.out.println("====================================================================================");
        Scanner varAux = new Scanner(System.in);


        int varAlegere = varAux.nextInt();

        switch (varAlegere) {
            case 1: {
                System.out.print("X = ");
                int x = varAux.nextInt();
                System.out.print("Y = ");
                int y = varAux.nextInt();
                int rezultat = x + y;
                System.out.println("Rezultatul: " + rezultat);
                break;
            }
            case 2: {
                System.out.print("X = ");
                int x = varAux.nextInt();
                System.out.print("Y = ");
                int y = varAux.nextInt();
                int rezultat = x - y;
                System.out.println("Rezultatul: " + rezultat);
                break;
            }
            case 3: {
                System.out.print("X = ");
                int x = varAux.nextInt();
                System.out.print("Y = ");
                int y = varAux.nextInt();
                int rezultat = x * y;
                System.out.println("Rezultatul: " + rezultat);
                break;
            }
            case 4: {
                System.out.print("X = ");
                int x = varAux.nextInt();
                System.out.print("Y = ");
                int y = varAux.nextInt();
                int rezultat = x / y;
                System.out.println("Rezultatul: " + rezultat);
                break;
            }
            case 5:{
                System.out.print("X = ");
                int x = varAux.nextInt();
                System.out.print("Y = ");
                int y = varAux.nextInt();
                int min = Math.min(x, y);
                System.out.println(min);
                break;

            }
            case 6: {
                System.out.print("X = ");
                int x = varAux.nextInt();
                System.out.print("Y = ");
                int y = varAux.nextInt();
                int min = Math.max(x, y);
                System.out.println(min);
                break;
            }
            default:
                System.out.println("Verificati introducerea datelor!");
        }




    }
}