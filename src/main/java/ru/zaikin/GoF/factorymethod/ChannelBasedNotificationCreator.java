package ru.zaikin.GoF.factorymethod;

public class ChannelBasedNotificationCreator extends NotificationCreator {

    @Override
    protected NotificationSender createSender(Notification notification) {
        switch (notification.channel) {
            case SMS:
                return new SmsSender();
            case EMAIL:
                return new EmailSender();
            // если позже добавим Push — просто добавим ещё case
            default:
                throw new IllegalArgumentException("Неизвестный канал: " + notification.channel);
        }
    }
}
