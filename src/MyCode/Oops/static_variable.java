package MyCode.Oops;

class Teacher {
    String name;
    static String school;  // change for all
    /*
    Static used in 4 ways by adding into:
    1. properties
    2. functions
    3. block
    4. nested class

    public static void changeSchool(){
        school = "newSchool";
    }

    */

}
public class static_variable {
    public static void main(String[] args) {
       Teacher.school = "ABC";
       Teacher t1 = new Teacher();
       t1.name = "Parth";
        System.out.println(t1.school);
    }
}
