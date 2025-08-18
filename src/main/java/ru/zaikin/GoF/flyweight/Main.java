package ru.zaikin.GoF.flyweight;

public class Main {
    public static void main(String[] args) {
        LoanType mortgage = LoanTypeFactory.getLoanType("Mortgage");
        LoanType consumer = LoanTypeFactory.getLoanType("ConsumerLoan");

        LoanApplication app1 = new LoanApplication("Иван", 100000, mortgage);
        LoanApplication app2 = new LoanApplication("Ольга", 50000, mortgage);
        LoanApplication app3 = new LoanApplication("Пётр", 20000, consumer);

        app1.display();
        app2.display();
        app3.display();
    }
}
