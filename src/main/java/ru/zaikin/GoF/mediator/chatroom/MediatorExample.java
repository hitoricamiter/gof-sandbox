package ru.zaikin.GoF.mediator.chatroom;

public class MediatorExample {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User u1 = new User("Аня", chat);
        User u2 = new User("Борис", chat);
        User u3 = new User("Катя", chat);

        u1.send("Привет всем!");
        u3.send("Здорово!");
    }
}
