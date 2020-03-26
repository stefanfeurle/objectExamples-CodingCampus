package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IMessenger[] messengerArr = new IMessenger[10];
        Messenger messenger = new Messenger();
        Slack slack = new Slack();
        //slack.messenger = messenger;  NICHT NOTWENDIG WEGEN METHODE INIT(MESSENGER) IM IMESSENGER
        WhatsApp whatsApp = new WhatsApp();
        //whatsApp.messenger = messenger;
        GMail gMail = new GMail();
        //gMail.messenger = messenger;
        Hotmail hotmail = new Hotmail();
        //hotmail.messenger = messenger;
        PostMan post = new PostMan();
        //post.messenger = messenger;
        messengerArr[0] = hotmail;
        messengerArr[1] = whatsApp;
        messengerArr[2] = gMail;
        messengerArr[3] = post;
        messengerArr[4] = slack;

        String emergencyString = "Corona";
        System.out.println("\nÜberall nur noch ...\n");
        for (IMessenger singleMessenger: messengerArr) {
            if(singleMessenger != null) {
                messenger.addMessengerServiceArr(singleMessenger);
                singleMessenger.Init(messenger);
                singleMessenger.setMessage(emergencyString);
                System.out.println(singleMessenger.getMessage());
            }
        }
        Scanner scanText = new Scanner(System.in);

        System.out.println("\nWas für eine Nachtricht möchten sie versenden!\n");
        String message = scanText.nextLine();

        messenger.setMessage(message);
        System.out.println();
        messenger.printMessengerServiceArr();
        int controllNumber = -1;
        Scanner scanNum = new Scanner(System.in);

        while (controllNumber < 0 || controllNumber > messenger.messengerCounter) {
            controllNumber = scanNum.nextInt();
        }
        if(controllNumber == 0) {
            messenger.sendMessage(messengerArr);
        } else {
            for (IMessenger singleMessenger: messengerArr) {
                if (singleMessenger != null) {
                    if (singleMessenger.getMessengerNumber() == controllNumber) {
                        messenger.sendMessage(singleMessenger);
                    }
                }
            }
        }

        System.out.println();
        if (controllNumber != 0) {
            for (IMessenger singleMessenger: messengerArr) {
                if (singleMessenger != null) {
                    if (singleMessenger.getMessengerNumber() == controllNumber) {
                        System.out.println(singleMessenger.getMessage());
                    }
                }
            }
        } else {
            for (IMessenger singleMessenger: messengerArr) {
                if (singleMessenger != null) {
                    System.out.println(singleMessenger.getMessage());
                }
            }
        }

        gMail.setMessage("Alles wird wieder gut!");
        gMail.sendMessage();
        System.out.println("\nIm " + messengerArr[2] + " ist eine Nachricht angekommen, welche an unseren Messenger weitergeleitet wird.\n");
        System.out.println(messenger.getMessage());

        SlackMarc mySlack = new SlackMarc("Stefan");
        SlackMarc marcsSlack = new SlackMarc("Marc");
        marcsSlack.sendMessage("Hi Stefan!");
        System.out.println("\nStefan receives: " + marcsSlack.getMessage());
        mySlack.sendMessage("Hello Marc");;
        System.out.println("Marc receives: " + mySlack.getMessage());
        marcsSlack.sendMessage("Hello Stefani du pussy");
        System.out.println("Stefan receives: " + marcsSlack.getMessage());
    }
}
