package ru.zaikin.GoF.factorymethod;

public class SmsSender implements NotificationSender {
    @Override
    public void send(Notification notification) {
        System.out.println("[SMS] " + notification.applicationId + " " + notification.text);
    }
}
