package ru.zaikin.GoF.state;

public class RejectedState implements CreditApplicationState {
    @Override
    public void process(CreditApplication application) {
        System.out.println("Заявка " + application.getId() + " — отклонена ❌");
    }
}
