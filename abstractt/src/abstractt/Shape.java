package abstractt;

//abstract class Shape {
//
//    public abstract double calculateArea();
//}
//
//class Square extends Shape {
//
//    private double side;
//
//    public Square(double side) {
//        this.side = side;
//
//    }
//
//    @Override
//    public double calculateArea() {
//        return side * side;
//    }
//
//    public static void main(String[] args) {
//        Square square = new Square(2);
//        System.out.println("Area of the square: " + square.calculateArea());
//    }
interface Shape{
    void draw();
    
}
class Circle implements Shape{
    //override 
//    public void draw(){
//        System.out.println("Drawing a circle");
//    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

