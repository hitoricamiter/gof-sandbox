package ru.zaikin.GoF.chainOfResponsibility;

public class Application {
    public String applicantId;
    public int creditScore;
    public boolean isFraudSuspicion;
    public double amount;

    public Application(String applicantId, int creditScore, boolean isFraudSuspicion, double amount) {
        this.applicantId = applicantId;
        this.creditScore = creditScore;
        this.isFraudSuspicion = isFraudSuspicion;
        this.amount = amount;
    }
}