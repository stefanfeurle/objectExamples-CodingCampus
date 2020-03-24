package com.company;

public class CreditCard implements IPayementOption{
    public Shop shop;
    double factor = 0.03;

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
        return "Kreditkarte - 3 % Aufschlag";
    }
}
