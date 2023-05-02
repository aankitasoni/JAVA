package MyCode.Oops;
class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Write Something");
    }
    public void PrintColor(){
        System.out.println(this.color);
    }
}

public class types_of_pen {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "red";
        pen1.type = "gel";
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen2.write();
        pen1.PrintColor();
        pen2.PrintColor();

    }
}
