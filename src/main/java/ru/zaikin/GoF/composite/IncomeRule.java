package ru.zaikin.GoF.composite;

public class IncomeRule implements Rule{
    @Override
    public boolean check(Application application) {
        return application.getIncome() >= 50000;
    }
}
