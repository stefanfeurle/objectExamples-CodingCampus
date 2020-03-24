package com.company;

public class GMail implements IMessenger{
    String message = "";
    Messenger messenger;
    @Override
    public void setMessage(String message1) {
        message = message1;
    }

    @Override
    public void sendMessage() {
        messenger.setMessage(this.message);
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
        return 3;
    }

    @Override
    public String toString() {
        return "GMail";
    }
}
