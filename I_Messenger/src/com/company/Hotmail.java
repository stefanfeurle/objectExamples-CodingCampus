package com.company;

public class Hotmail implements IMessenger {
    String message = "";
    Messenger messenger;
    @Override
    public void setMessage(String message1) {
        message = message1;
    }

    @Override
    public void sendMessage() {
        messenger.setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void Init(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public int getMessengerNumber() {
        return 1;
    }

    @Override
    public String toString() {
        return "Hotmail";
    }
}
