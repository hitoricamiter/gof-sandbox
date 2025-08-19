package ru.zaikin.GoF.mediator.serviceMediator;

public class CreditHistoryChecker extends Service{
    public CreditHistoryChecker(ScoringMediator mediator) {
        super(mediator);
    }

    public void checkHistory() {
        System.out.println("Проверка кредитной истории");
        mediator.notify(this, "history_ok");
    }
}
