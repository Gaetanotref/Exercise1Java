public class Programmer {
    //instance variables
    public String name;
    public int age;
    public boolean wearsGlasses;
    //Methods
    public Programmer(String name, int age, boolean wearsGlasses){
        this.name=name;
        this.age=age;
        this.wearsGlasses=wearsGlasses;
    }

    public void drinkcoffe(){
        System.out.println("Espresso is the secret");
    }

    public void printDetails(Programmer programmer){
        System.out.println(programmer.name +" is a " + programmer.age+ " years old programmer");
    }
    public void hasGlasses(Programmer programmer){
        System.out.println(programmer.name + " is wearing glasses? "+programmer.wearsGlasses);
    }



}
