package ru.zaikin.GoF.bridge;

public class Application {
    public static void main(String[] args) {
        Notification notif1 = new ApplicationApproved(new SmsSender());
        notif1.notifyUser("Alice"); // SMS: Application approved for Alice

        Notification notif2 = new ApplicationRejected(new EmailSender());
        notif2.notifyUser("Bob");   // Email: Application rejected for Bob

        Notification notif3 = new ApplicationApproved(new PushSender());
        notif3.notifyUser("Carol"); // Push: Application approved for Carol
    }
}
/*
* Когда у нас растет различная комбинация классов можно использовать паттерн Bridge
* Создаем интерфейс, нужные реализации, затем абстрактный класс, который принимает какую-либо из реализаций
* Затем наследуем абстрактный класс создавая нужные реализации передавая в конструктор нужное поведение
* Можно добавлять независимо новые типы поведения
* */