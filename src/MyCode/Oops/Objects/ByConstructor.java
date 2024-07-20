package MyCode.Oops.Objects;

class Student{
    int id ;
    String name;


    // Constructor class calling
    Student(int roll, String naam){
        this.id = roll;
        this.name = naam;
    }

    void display(){
        System.out.println(id + " " + name);
    }
}

public class ByConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Raj");
        Student s2 = new Student(11, "Rajodhar");
        s1.display();
        s2.display();
    }
}
