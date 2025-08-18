package ru.zaikin.GoF.interpretator;

public class IncomeExpression implements Expression{

    private final int income;

    public IncomeExpression(int income) {
        this.income = income;
    }

    @Override
    public boolean interpret(Application application) {
        return application.getIncome() >= income;
    }
}
