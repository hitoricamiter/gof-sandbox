package ru.zaikin.GoF.factorymethod;

public class Notification {
    public final String applicationId;
    public final String text;
    public final Channel channel;

    public enum Channel { SMS, EMAIL}

    public Notification(String applicationId, String text, Channel channel) {
        this.applicationId = applicationId;
        this.text = text;
        this.channel = channel;
    }
}
