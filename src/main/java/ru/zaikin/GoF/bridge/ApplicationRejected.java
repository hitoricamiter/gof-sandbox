package ru.zaikin.GoF.bridge;

public class ApplicationRejected extends Notification {

    public ApplicationRejected(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String user) {
        sender.send("Application rejected: " + user);
    }
}
