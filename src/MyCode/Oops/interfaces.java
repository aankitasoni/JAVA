package MyCode.Oops;
/* Interface == hide all useless data
1. don't have constructor
2. don't have non abstract function
3. don't have implementation of any function

*/
interface Animals {
    // int eyes = 2; -- define for all and it's static - can't change value
    public void walk();  // abstract & public by default
}
interface Herbivore{

}
class Zebra implements Animals, Herbivore{
    public void walk(){     // public must to write
        System.out.println("Walks on 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Zebra z1 = new Zebra();
        z1.walk();

    }
}
