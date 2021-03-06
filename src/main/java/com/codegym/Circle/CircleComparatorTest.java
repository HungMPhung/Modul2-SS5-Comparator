package com.codegym.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest{
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle("blue", true, 1);
        circles[1] = new Circle("green", false, 3);
        circles[2] = new Circle("black", true, 2);

//        System.out.println("Pre-sorted:");
//        for (Circle circle: circles){
//            System.out.println(circle);
//        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}