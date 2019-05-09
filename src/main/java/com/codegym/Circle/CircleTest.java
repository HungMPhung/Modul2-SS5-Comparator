package com.codegym.Circle;

public class CircleTest extends Circle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle("blue", true, 5);
        System.out.println(circle);
    }
}