package ru.zaikin.GoF.state;

public class NewState implements CreditApplicationState {
    @Override
    public void process(CreditApplication application) {
        System.out.println("Заявка: " + application.getId() + " -- новое состояние. переходим к скорингу");
        application.setState(new ScoringState());
    }
}
