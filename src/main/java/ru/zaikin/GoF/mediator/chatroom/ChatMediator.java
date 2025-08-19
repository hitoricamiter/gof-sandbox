package ru.zaikin.GoF.mediator.chatroom;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
