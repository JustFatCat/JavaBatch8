package com.syntax.class22;

public class HW1 {
    double length, width, height;
    double area, volume;
    public double calcArea(double length, double width){
        area = length * width;
        return area;
    }
    public double calcArea(double length){
        area = length * length;
        return area;
    }
    public double calcArea(double length, double width, double height){
        volume = length * width * height;
        return volume;
    }

}
