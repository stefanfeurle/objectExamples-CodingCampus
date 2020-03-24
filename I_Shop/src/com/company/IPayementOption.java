package com.company;

public interface IPayementOption {
    double payBill(double sum);
    void init (Shop shop);
    String toString();
}
