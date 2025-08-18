package ru.zaikin.GoF.decorator;

public class ScoringDecorator implements Scoring {

    protected Scoring decoratedScoring;

    public ScoringDecorator(Scoring decoratedScoring) {
        this.decoratedScoring = decoratedScoring;
    }

    @Override
    public double calculate(Application application) {
        return decoratedScoring.calculate(application);
    }
}
