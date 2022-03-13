//import java.util.Scanner;
abstract class Shape{
    abstract void noOfSides();
}
class Rectangle extends Shape{
    void noOfSides() {
        System.out.println("The number of sides is : "+4);
    }
}
class Triangle extends Shape{
    void noOfSides(){
        System.out.println("The number of sides is : "+3);
    }
}
class Hexagon extends Shape{
    void noOfSides() {
        System.out.println("The number of sides is : "+6);
        
    }
}
public class Abstract{
    public static void main(String [] args){
        Rectangle rectangle=new Rectangle();
        Triangle triangle=new Triangle();
        Hexagon hexagon=new Hexagon();
        rectangle.noOfSides();
        triangle.noOfSides();
        hexagon.noOfSides();
    }
}