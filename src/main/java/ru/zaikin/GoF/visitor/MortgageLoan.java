package ru.zaikin.GoF.visitor;

public class MortgageLoan implements LoanApplication {
    private String clientName;
    private double propertyValue;

    public MortgageLoan(String clientName, double propertyValue) {
        this.clientName = clientName;
        this.propertyValue = propertyValue;
    }

    public String getClientName() { return clientName; }
    public double getPropertyValue() { return propertyValue; }

    @Override
    public void accept(LoanVisitor visitor) {
        visitor.visit(this);
    }
}