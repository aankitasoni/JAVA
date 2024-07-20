package MyCode.Oops.Objects;//package MyCode.Oops.Objects;

class Student2{
    int id;
    String name;

    void studentDetails(int roll, String naam){
        this.id = roll;
        this.name = naam;
    }
    // add method to print
    void display(){
        System.out.println(id + " " + name);
    }

}

public class ByMethods {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.studentDetails(14, "Priya");
        s1.display();
    }
}
