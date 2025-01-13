package com.example.geometry.utils;

import com.example.geometry.*;

public class GeometryHelper {

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static int compareAreas(Shape shape1, Shape shape2) {
        double area1 = shape1.calculateArea();
        double area2 = shape2.calculateArea();

        return Double.compare(area1, area2);
    }
    public static String compareShapes(Shape shape1, Shape shape2) {
        int comparisonResult = compareAreas(shape1, shape2);
        if (comparisonResult < 0) {
            return "Shape 1 has a smaller area than Shape 2";
        } else if (comparisonResult > 0) {
            return "Shape 1 has a larger area than Shape 2";
        } else {
            return "Shape 1 and Shape 2 have equal areas";
        }
    }
}
