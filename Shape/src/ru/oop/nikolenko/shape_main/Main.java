package ru.oop.nikolenko.shape_main;

import ru.oop.nikolenko.shape.*;

import java.util.Arrays;

public class Main {
    public static Shape getMaxAreaShape(Shape[] shapes) {
        Arrays.sort(shapes, new SortByAreaComparator());
        return shapes[shapes.length - 1];
    }

    public static Shape getShapeWithCountByPerimeterSize(Shape[] shapes, int countByPerimeterSize) {
        Arrays.sort(shapes, new SortByPerimeterComparator());
        return shapes[shapes.length - countByPerimeterSize];
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(5),
                new Triangle(0, 0, 5, 0, 0, 7),
                new Rectangle(4, 8),
                new Circle(3),
                new Square(3),
                new Circle(2)
        };

        Shape maxAreaShape = getMaxAreaShape(shapes);
        System.out.println("Фигура с максимальной площадью: " + maxAreaShape);

        Shape secondPerimeterShape = getShapeWithCountByPerimeterSize(shapes, 2);
        System.out.println("Фигура со вторым по велечине периметром: " + secondPerimeterShape);
    }
}