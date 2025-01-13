package com.example;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import com.example.geometry.utils.GeometryHelper;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты фигур
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8, 12);
        Triangle triangle = new Triangle(5, 5, 8);

        // Выводим информацию о фигурах
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

        // Используем GeometryHelper
        double inches = 10;
        double centimeters = GeometryHelper.inchesToCentimeters(inches);
        System.out.println(inches + " inches is " + centimeters + " centimeters");

        double cm = 20;
        double inch = GeometryHelper.centimetersToInches(cm);
        System.out.println(cm + " centimeters is " + inch + " inches");
        System.out.println();

        System.out.println("Comparison of Circle and Rectangle");
        System.out.println(GeometryHelper.compareShapes(circle, rectangle));

        System.out.println("Comparison of Triangle and Circle");
        System.out.println(GeometryHelper.compareShapes(triangle,circle));
    }
}
