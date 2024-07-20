package MyCode.Oops.Objects;

class Student3{
    int id ;
    String name;


    // Constructor class calling
    Student3(int roll, String naam){
        this.id = roll;
        this.name = naam;
    }

    void display(){
        System.out.println(id + " " + name);
    }
}

public class ByConstructor {
    public static void main(String[] args) {
        Student3 s1 = new Student3(10, "Raj");
        Student3 s2 = new Student3(11, "Rajodhar");
        s1.display();
        s2.display();
    }
}
