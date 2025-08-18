package ru.zaikin.GoF.singletone;

public class Logger {

    // 1. Статическая переменная для хранения единственного экземпляра
    private static Logger instance;

    // 2. Приватный конструктор — никто не может создать объект напрямую
    private Logger() {
        System.out.println("Logger created");
    }

    // 3. Публичный метод доступа
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // создаём объект только один раз
        }
        return instance;
    }

    // 4. Методы класса
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

// Клиентский код
class SingletonDemo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println("logger1 == logger2 ? " + (logger1 == logger2));
    }
}
