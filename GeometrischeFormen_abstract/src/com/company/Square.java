package com.company;

public class Square extends GeometricFigure{

    @Override
    public int calculateArea() {
       area = length * length;
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
        for(int i = 0; i < length - 1; i++) {
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
}
