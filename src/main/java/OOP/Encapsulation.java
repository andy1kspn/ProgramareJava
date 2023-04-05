package OOP;

public class Encapsulation {

    private String name;
    private int age;
    public void getName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void getAge(String newAge){
        age = newAge;
    }
    public String getAge(){
        return age;
    }


}
