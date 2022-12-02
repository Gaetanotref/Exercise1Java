package it.develhope.ex1;

public class Programmer {
    //instance variables
    private String name;
    private int age;
    private boolean wearsGlasses;
    //Methods
    public Programmer(String name, int age, boolean wearsGlasses){
        this.name=name;
        this.age=age;
        this.wearsGlasses=wearsGlasses;
    }

    public void drinkcoffe(){
        System.out.println("Espresso is the secret");
    }

    public void printDetails(){
        System.out.println(name +" is a " + age+ " years old programmer");
    }
    public void hasGlasses(){
        System.out.println(name + " is wearing glasses? "+wearsGlasses);
    }



}
