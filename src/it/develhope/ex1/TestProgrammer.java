package it.develhope.ex1;

import it.develhope.ex1.Programmer;

public class TestProgrammer {
    public static void main(String[] args) {
        //Creating programmers(instance)
        Programmer giacomo = new Programmer("Giacomo",20,false);
        Programmer francesco = new Programmer("Francesco",40,true);

        //Call methods
        giacomo.drinkcoffe();
        giacomo.printDetails();

        francesco.printDetails();
        francesco.hasGlasses();
    }
}
