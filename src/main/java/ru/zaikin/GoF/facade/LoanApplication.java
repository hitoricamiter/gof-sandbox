package ru.zaikin.GoF.facade;

public class LoanApplication {
    private String applicationName;
    private double requestedAmount;

    public LoanApplication(String applicationName, double requestedAmount) {
        this.applicationName = applicationName;
        this.requestedAmount = requestedAmount;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}
