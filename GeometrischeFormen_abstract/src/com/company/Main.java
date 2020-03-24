package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        square.setLength(5);
        rectangle.setLength(24);
        rectangle.setWidth(12);


        System.out.println("\nLänge: \t\t " + square.getLength() + "\nFläche: \t" + square.calculateArea() + "\n");
        square.draw();

        System.out.println("\nLänge: \t\t " + rectangle.getLength() + "\nBreite:\t\t " + rectangle.getWidth() +
                "\nFläche: \t" + rectangle.calculateArea() + "\n");
        rectangle.draw();
    }
}
