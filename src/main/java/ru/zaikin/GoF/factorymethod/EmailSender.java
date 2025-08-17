package ru.zaikin.GoF.factorymethod;

public class EmailSender implements NotificationSender{
    @Override
    public void send(Notification notification) {
        System.out.println("[EMAIL] " + notification.applicationId + " " + notification.text);
    }
}
