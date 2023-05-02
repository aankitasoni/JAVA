package MyCode.Oops;

// Polymorphism - 1.Function Overloading = compile time polymorphism
// create different function with same name

class Person {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo (String name, int age){
        System.out.println(name + " " + age);
    }
}
public class function_overloading {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "rahul";
        p1.age = 15;
        p1.printInfo(p1.name, p1.age);
    }
}
