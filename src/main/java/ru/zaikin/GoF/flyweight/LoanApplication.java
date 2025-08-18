package ru.zaikin.GoF.flyweight;

public class LoanApplication {
    private String applicationName;
    private double amount;
    private LoanType loanType;

    public LoanApplication(String applicationName, double amount, LoanType loanType) {
        this.applicationName = applicationName;
        this.amount = amount;
        this.loanType = loanType;
    }

    public void display() {
        System.out.println(applicationName + " запросил " + amount + " по типу кредита " + loanType.getTypeName());
    }
}
