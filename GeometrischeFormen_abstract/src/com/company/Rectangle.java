package com.company;

public class Rectangle extends GeometricFigure {
    int width;

    @Override
    public int calculateArea() {
        area = length * width;
        return area;
    }

    @Override
    public void draw() {
        factor = calcFactor();
        System.out.print("\t ");
        for(int i = 0; i < length * factor; i++) {
            System.out.print("_");
        }
        System.out.println();
        for(int i = 0; i < width - 1; i++) {
            System.out.print("\t|");
            for (int j = 0; j < length * factor; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("\t|");
        for (int i = 0; i < length * factor; i++) {
            System.out.print("_");
        }
        System.out.println("|\n");

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
