package MyCode.Oops;

abstract class Animal{   // animal is concept
    abstract void walk(); // abstract -- walk has nothing to with
    Animal(){  // constructor of animal
        System.out.println("You are creating a new animal");
    }
    public void eats(){
        System.out.println("Animal eats");  // non-abstract
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse Constructor");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eats();
    }
}
