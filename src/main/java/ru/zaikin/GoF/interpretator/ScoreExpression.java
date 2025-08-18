package ru.zaikin.GoF.interpretator;

public class ScoreExpression implements Expression {
    private final int threshold;

    public ScoreExpression(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean interpret(Application application) {
        return application.getScore() >= threshold;
    }
}
