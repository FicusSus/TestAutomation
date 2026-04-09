package com.bootcampexercise.module5;

public class AbstractActivity {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setLength(5);
        rectangle.setWidth(3);

        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.setRadius(4);

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    }
}
