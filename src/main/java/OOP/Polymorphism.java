package OOP;

class Caine{
    public void rasa(){
        System.out.println("Basic");
    }
}

class Pekingese extends Caine(){
public void rasa(){
    System.out.println("Pekingese");
    }
}
class Labrador extends Caine(){
public void rasa(){
        System.out.println("Labrador");
        }
}


public class Polymorphism {

    Pekingese mic = new Pekingese();
    mic.rasa();




}
