package shapecalculationsystem;

abstract class Shape{

    abstract double calculatearea();
    abstract double calculateparameter();
}
  class Circle extends Shape {
    double radius ;

    Circle(double radius){
        this.radius = radius;
    }
     double calculatearea(){
        return 3.14 * radius * radius;
     }
     double calculateparameter(){
        return 2 * 3.14 * radius;
     }

}
 class rectangle extends Shape{
    double length;
    double width;

    rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    double calculatearea(){
        return length * width;
    }
    double calculateparameter(){
        return 2 * ( length + width);
    }

}

public class ShapeCalculation {
    public static void main(String [] args) {

        Shape s;

        s = new Circle(5);
        System.out.println("Circle Area: " + s.calculatearea());
        System.out.println("Circle Perimeter: " + s.calculateparameter());

        s = new rectangle(4, 6);
        System.out.println("Rectangle Area: " + s.calculatearea());
        System.out.println("Rectangle Perimeter: " + s.calculateparameter());
    }
}

