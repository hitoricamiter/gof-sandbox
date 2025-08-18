package ru.zaikin.GoF.mediator;

public class DecisionService {
    public void makeDecision(int score) {
        String result = score > 700 ? "APPROVED" : "REJECTED";
        System.out.println("Decision result: " + result);
    }
}
