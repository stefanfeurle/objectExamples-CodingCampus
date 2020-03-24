package com.company;

public class Bar implements IPayementOption{
    public Shop shop;
    double factor = -0.01;

    public double payBill(double sum) {
        sum = sum * factor;
        return sum;
    }

    @Override
    public void init(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "bar - 1 % Skonto";
    }
}
