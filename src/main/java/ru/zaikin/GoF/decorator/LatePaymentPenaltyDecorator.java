package ru.zaikin.GoF.decorator;

public class LatePaymentPenaltyDecorator extends ScoringDecorator {
    public LatePaymentPenaltyDecorator(Scoring decoratedScoring) {
        super(decoratedScoring);
    }

    @Override
    public double calculate(Application application) {
        double score = super.calculate(application);

        if (application.hasLatePayments()) {
            score -= 1000;
        }

        return score;
    }
}
