package com.company;

public class Messenger {
    String message = "";
    int messengerCounter = 0;
    IMessenger[] myMessengers = new IMessenger[10];

    public void setMessage(String message1) {
        message = message1;
    }

    public void sendMessage(IMessenger messenger){
        IMessenger[] messengers = new IMessenger[1];
        messengers[0]= messenger;
        sendMessage(messengers);
    }

    public void sendMessage(IMessenger[] messengers){
        for (IMessenger messenger : messengers) {
            if(messenger != null){
                String tempMessage = "Stefan send:\n" + this.message;
                messenger.setMessage(tempMessage);
            }
        }
    }

    public String getMessage() {
        return message;
    }

    public void addMessengerServiceArr(IMessenger messenger){
        myMessengers[messengerCounter] = messenger;
        messengerCounter++;
    }

    public void printMessengerServiceArr() {
        System.out.println("An welchen Messengerdienst möchtest du deine Nachricht schicken?");
        for (int i = 0; i < messengerCounter; i++) {
            System.out.println(myMessengers[i].getMessengerNumber() + ". " + myMessengers[i]);
        }
        System.out.println("\n0. ALLE\n");
    }
}
