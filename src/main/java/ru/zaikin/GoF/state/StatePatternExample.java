package ru.zaikin.GoF.state;

public class StatePatternExample {
    public static void main(String[] args) {
        CreditApplication app = new CreditApplication("A1");

        app.process(); // NEW → SCORING
        app.process(); // SCORING → MANUAL_REVIEW / APPROVED
        app.process(); // если была ручная проверка → APPROVED
        app.process(); // финальное состояние
    }
}
