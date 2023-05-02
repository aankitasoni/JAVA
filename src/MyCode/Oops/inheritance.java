package MyCode.Oops;
/*
 Inheritance -- pass 1 method or property of one class to another

1. Single Layer Inheritance == base class --> derived class
2. Multi Layer Inheritance == base class --> derived class --> derived class
3. Hieraricial Inheritance == derived class --> base class --> derived class
4. Hybrid Inheritance == multiple interitance at one place

 */
class Shape{
    public void area(){
        System.out.println("display area");
    }
}

// single layer
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}

// multi layer

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}

// Hierarchial

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        EquilateralTriangle e1 = new EquilateralTriangle();
        Circle c1 = new Circle();
        t1.area(5, 6);
        e1.area(2,4);
        c1.area(5);
    }
}
