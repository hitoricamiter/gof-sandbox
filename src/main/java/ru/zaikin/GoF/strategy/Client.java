package ru.zaikin.GoF.strategy;

public class Client {
    private String type; // "NEW", "VIP"
    private double income;
    private double creditHistoryScore;

    public Client(String type, double income, double creditHistoryScore) {
        this.type = type;
        this.income = income;
        this.creditHistoryScore = creditHistoryScore;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getCreditHistoryScore() {
        return creditHistoryScore;
    }

    public void setCreditHistoryScore(double creditHistoryScore) {
        this.creditHistoryScore = creditHistoryScore;
    }

    // конструктор, геттеры
}