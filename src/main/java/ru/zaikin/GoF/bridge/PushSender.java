package ru.zaikin.GoF.bridge;

public class PushSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}
