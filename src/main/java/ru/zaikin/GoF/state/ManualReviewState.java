package ru.zaikin.GoF.state;

public class ManualReviewState implements CreditApplicationState {
    @Override
    public void process(CreditApplication application) {
        System.out.println("Заявка : " + application.getId() + " - на ручной проверка");
        application.setState(new ApprovedState());
    }
}
