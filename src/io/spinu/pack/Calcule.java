package io.spinu.pack;

public class Calcule {
    private int i = 0;
    public float result = 0.0f;

    public float calculateResult() {
        while(i != 5){
            result += 2.1f;
            i++;
        }
        System.out.println(result);
        return result;
    }
}
