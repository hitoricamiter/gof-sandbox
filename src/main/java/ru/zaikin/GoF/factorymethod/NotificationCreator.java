package ru.zaikin.GoF.factorymethod;

public abstract class NotificationCreator {

    public final void notify(Notification notification) {
        NotificationSender sender = createSender(notification); // Возвращает Sms / Email sender
        sender.send(notification);
    }

    protected abstract NotificationSender createSender(Notification notification);
}
