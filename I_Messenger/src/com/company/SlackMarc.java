package com.company;

public class SlackMarc implements IMessengerMarc {
    String message = "";
    String user = "";

    public SlackMarc(String user){
        this.user = user;
    }
    @Override
    public void sendMessage(String message) {
        this.message = this.user + " 11:48 \n" + message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "SlackMarc";
    }
}
