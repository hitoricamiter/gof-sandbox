package ru.zaikin.GoF.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LoanApplication> applications = List.of(
                new ConsumerLoan("Иван", 1000),
                new MortgageLoan("Ольга", 500000)
        );

        LoanVisitor riskVisitor = new RiskAssessmentVisitor();

        for (LoanApplication app : applications) {
            app.accept(riskVisitor);
        }
    }
}