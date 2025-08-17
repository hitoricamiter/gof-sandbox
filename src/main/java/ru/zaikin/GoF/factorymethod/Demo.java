package ru.zaikin.GoF.factorymethod;

public class Demo {
    public static void main(String[] args) {
        NotificationCreator creator = new ChannelBasedNotificationCreator();

        Notification sms = new Notification("app-1", "Ваш кредит одобрен", Notification.Channel.SMS);
        creator.notify(sms); // вызовет SmsSender.send()

        Notification email = new Notification("app-2", "Нам нужны документы", Notification.Channel.EMAIL);
        creator.notify(email); // вызовет EmailSender.send()

    }
}

/*
«В Notification Service мы использовали паттерн Factory Method.
Общая логика формирования уведомления вынесена в абстрактный класс NotificationCreator
, а конкретные реализации (SmsSender, EmailSender, PushSender) инкапсулируют детали отправки по разным каналам.
Concrete Creator (ChannelBasedNotificationCreator) выбирает нужный отправитель по notification.channel.
Это позволило добавлять новые каналы без изменения основной логики, снизило связность и упростило тестирование.»
*/
