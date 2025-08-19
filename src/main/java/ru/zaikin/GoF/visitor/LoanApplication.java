package ru.zaikin.GoF.visitor;

public interface LoanApplication {
    void accept(LoanVisitor visitor);
}
