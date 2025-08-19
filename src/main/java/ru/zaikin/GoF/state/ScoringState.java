package ru.zaikin.GoF.state;

public class ScoringState implements CreditApplicationState {
    @Override
    public void process(CreditApplication application) {
        System.out.println("Заявка: " + application.getId() + " - проходит скоринг");
        boolean needsManual = Math.random() < 0.5;

        if (needsManual) {
            application.setState(new ManualReviewState());
        } else {
            application.setState(new ApprovedState());
        }

    }
}
