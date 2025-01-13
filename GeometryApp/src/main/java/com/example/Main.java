package com.example;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты фигур
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8, 12);
        Triangle triangle = new Triangle(5, 5, 8);

        System.out.println("--- Круг ---");
        System.out.println(circle.toString());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Прямоугольник ---");
        System.out.println(rectangle.toString());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Треугольник ---");
        System.out.println(triangle.toString());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println();

    }
}
