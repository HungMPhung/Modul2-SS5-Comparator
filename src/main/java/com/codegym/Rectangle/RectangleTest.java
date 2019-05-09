package com.codegym.Rectangle;

import com.codegym.Shape;

public class RectangleTest extends Shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle("orange",true,3,4);
        System.out.println(rectangle);
    }
}