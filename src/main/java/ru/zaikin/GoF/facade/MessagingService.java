package ru.zaikin.GoF.facade;

public class MessagingService {
    public void sendNotification(String applicationName, String message) {
        System.out.println("Уведомление для" + applicationName + ": " + message);
    }
}
