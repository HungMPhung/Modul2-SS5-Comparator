package com.codegym.Circle;

import com.codegym.Shape;

public class Circle extends Shape {
    public Circle() {
    }
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean fill, double radius){
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getParameter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + getRadius() + "\n"
                + "Circle Area is " + getArea() + "\n"
                + "Circle Parameter is " + getParameter() + "\n"
                + super.toString();
    }
}
