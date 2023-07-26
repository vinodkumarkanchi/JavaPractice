package com.qa;

public class MainAgain {
    public static void main(String[] args) {
        Circle c = new Circle ("circle1", "red", 0,0,
                10);
        Circle c2 = new Circle ("circle2", "blue", 10,10,
                5);

        System.out.println(c);
        System.out.println(c2);

        System.out.println("Circle location before move: " + c.getCurrentLocation());
        c.move(10.5,4.3);
        System.out.println("Circle location after move: " + c.getCurrentLocation());
    }
}