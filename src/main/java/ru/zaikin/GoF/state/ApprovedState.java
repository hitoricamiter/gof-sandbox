package ru.zaikin.GoF.state;

public class ApprovedState implements CreditApplicationState {
    @Override
    public void process(CreditApplication application) {
        System.out.println("Заявка " + application.getId() + " — одобрена ✅");
    }
}