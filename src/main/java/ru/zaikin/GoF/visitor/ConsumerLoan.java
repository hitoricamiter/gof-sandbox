package ru.zaikin.GoF.visitor;

public class ConsumerLoan implements LoanApplication {

    private String clientName;
    private double amount;

    public ConsumerLoan(String clientName, double amount) {
        this.clientName = clientName;
        this.amount = amount;
    }

    public String getClientName() {
        return clientName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void accept(LoanVisitor visitor) {
        visitor.visit(this);
    }
}
