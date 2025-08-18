package ru.zaikin.GoF.decorator;

public class Application {
    private String name;
    private int age;
    private double income;
    private boolean hasLatePayments;
    private double macroFactor;

    public Application(String name, int age, double income, boolean hasLatePayments, double macroFactor) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.hasLatePayments = hasLatePayments;
        this.macroFactor = macroFactor;
    }

    public int getAge() { return age; }
    public double getIncome() { return income; }
    public String getName() { return name; }
    public boolean hasLatePayments() { return hasLatePayments; }
    public double getMacroFactor() { return macroFactor; }
}

