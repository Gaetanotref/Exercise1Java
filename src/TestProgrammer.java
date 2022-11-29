public class TestProgrammer {
    public static void main(String[] args) {
        //Creating programmers(instance)
        Programmer giacomo = new Programmer("Giacomo",20,false);
        Programmer francesco = new Programmer("Francesco",40,true);

        //Call methods
        giacomo.drinkcoffe();
        giacomo.printDetails(giacomo);

        francesco.printDetails(francesco);
        francesco.hasGlasses(francesco);
    }
}
