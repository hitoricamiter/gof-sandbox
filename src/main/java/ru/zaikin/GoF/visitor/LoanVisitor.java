package ru.zaikin.GoF.visitor;

public interface LoanVisitor {
    void visit(ConsumerLoan loan);
    void visit (MortgageLoan loan);
}
