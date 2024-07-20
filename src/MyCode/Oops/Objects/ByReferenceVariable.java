package MyCode.Oops.Objects;

class Student{
    int id;
    String name;
}

public class ByReferenceVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 109;
        s1.name = "Hello";
        System.out.println(s1.id);
        Student s2 = new Student();
        s2.id = 900;
        s2.name="Raj";
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
