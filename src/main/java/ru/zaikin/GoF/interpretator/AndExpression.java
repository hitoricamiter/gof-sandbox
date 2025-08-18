package ru.zaikin.GoF.interpretator;

public class AndExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Application application) {
        return left.interpret(application) && right.interpret(application);
    }
}
