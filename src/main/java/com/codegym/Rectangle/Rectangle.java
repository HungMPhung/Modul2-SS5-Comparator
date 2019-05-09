package com.codegym.Rectangle;

import com.codegym.Shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean fill, double width, double height) {
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getParameter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and height = " + height + "\n"
                + "Rectangle Area is " + getArea() + "\n"
                + "Rectangle Parameter is " + getParameter() + "\n"
                + super.toString();
    }
}
