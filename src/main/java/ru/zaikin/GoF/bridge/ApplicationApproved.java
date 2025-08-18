package ru.zaikin.GoF.bridge;

public class ApplicationApproved extends Notification{

    public ApplicationApproved(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String user) {
        sender.send("Application approved: " + user);
    }
}
