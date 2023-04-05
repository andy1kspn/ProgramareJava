package org.example;


import OOP.Encapsulation;
import OOP.Masina;
import OOP.Toyota;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Masina supra = new Toyota(250, "Supra", true, 2003500L, "2JZ-GTE");

        Encapsulation ia2201 = new Encapsulation();
        ia2201.getName("Andrei");
        ia2201.getAge(20);



        System.out.println("====================================================================================");
        System.out.println("Alegeti o opriune: \n 1) Adunarea! \n 2) Scaderea! \n 3) Inmultirea! \n 4) Impartirea!  \n 5) Minimul dintre 2 numere! \n 6) Maximul dintre 2 numere! ");
        System.out.println("====================================================================================");
        Scanner varAux = new Scanner(System.in);


        int x = 0;
        int j = 0;

        do{
            System.out.println("Felicitari, ai castigat!");
            x++;
        }
        while (x<5);

        for(j=0;j<=5;j++){
            System.out.println("Felicitari, ai castigat!");
        }



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





