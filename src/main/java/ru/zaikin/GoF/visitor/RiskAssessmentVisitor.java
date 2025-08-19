package ru.zaikin.GoF.visitor;

public class RiskAssessmentVisitor implements LoanVisitor {
    @Override
    public void visit(ConsumerLoan loan) {
        System.out.println("Оценка риска потребительского кредита " + loan.getClientName());
    }

    @Override
    public void visit(MortgageLoan loan) {
        System.out.println("Оценка риска ипотеки: " + loan.getClientName());
    }
}
