package MyCode.Oops;

class Students{
    String name;
    int age;

    Students() {

    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(Students s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class copy_constructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "aman";
        s1.age = 21;

        Students s2 = new Students(s1);
        s2.name = "payal";
        s2.age = 19;
        s1.printInfo();
        s2.printInfo();
    }
}


