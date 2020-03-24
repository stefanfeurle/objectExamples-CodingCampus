package com.company;

public abstract class GeometricFigure {
    public int length;
    public int area;
    public double factor;

    public abstract  int calculateArea();

    public abstract  void draw();

    public double calcFactor() {
        if(length < 4){
            factor = 2;
        }
        else if (length < 9) {
            factor = 2.3;
        }
        else {
            factor = 2.6;
        }
        return factor;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
}
