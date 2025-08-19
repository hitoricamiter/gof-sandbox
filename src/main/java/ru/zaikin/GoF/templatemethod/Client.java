package ru.zaikin.GoF.templatemethod;

public class Client {
    private String name;
    private double income;

    public Client(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }
}
