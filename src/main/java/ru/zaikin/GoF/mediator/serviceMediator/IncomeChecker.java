package ru.zaikin.GoF.mediator.serviceMediator;

public class IncomeChecker extends Service {
    public IncomeChecker(ScoringMediator mediator) { super(mediator); }

    public void checkIncome() {
        System.out.println("Проверка дохода...");
        mediator.notify(this, "income_ok");
    }
}