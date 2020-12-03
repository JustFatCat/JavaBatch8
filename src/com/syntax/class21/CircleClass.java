package com.syntax.class21;

public class CircleClass extends ShapeClass {
    /*Write program: Shape class has a constructor
    that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code*/
    double square;
    double p = 3.141592653589793238462643;

    CircleClass(double radius){
        super(radius);
    }
    public void calcArea(){
        square = p * (radius*radius);
        System.out.println(square);
    }

    public static void main(String[] args) {
        CircleClass circleClass = new CircleClass(5);
        circleClass.calcArea();
    }
}
