package org.spinu;

public class Blocks {

    int x = 5;
    static int y = 16;
    final String name = "Andrei";

    {
        System.out.println("Salut!");
    }
    static {
        y = 20;
    }


    public Blocks(int x) {
        this.x = x;
    }

}

