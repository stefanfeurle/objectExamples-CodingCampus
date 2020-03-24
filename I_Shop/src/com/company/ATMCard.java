package com.company;

public class ATMCard implements IPayementOption{
    public Shop shop;

    public double payBill(double sum) {
        return 0.00;
    }

    @Override
    public void init(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Bankomatkarte";
    }
}
