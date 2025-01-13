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

        // Выводим информацию о фигурах
        System.out.println("--- Круг ---");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Прямоугольник ---");
        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Треугольник ---");
        System.out.println("Сторона A: " + triangle.getSideA());
        System.out.println("Сторона B: " + triangle.getSideB());
        System.out.println("Сторона C: " + triangle.getSideC());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println();

        // Изменяем параметры и снова выводим
        circle.setRadius(10);
        rectangle.setLength(10);
        rectangle.setWidth(15);
        triangle.setSideA(6);
        triangle.setSideB(8);
        triangle.setSideC(10);

        System.out.println("--- Измененный круг ---");
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Измененный прямоугольник ---");
        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Измененный треугольник ---");
        System.out.println("Сторона A: " + triangle.getSideA());
        System.out.println("Сторона B: " + triangle.getSideB());
        System.out.println("Сторона C: " + triangle.getSideC());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
    }
}
