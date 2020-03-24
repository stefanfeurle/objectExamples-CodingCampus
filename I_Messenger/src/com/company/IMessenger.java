package com.company;

public interface IMessenger {
    void setMessage(String message1);
    void sendMessage();
    String getMessage();
    void Init(Messenger messenger);
    int getMessengerNumber();
    String toString();
}
