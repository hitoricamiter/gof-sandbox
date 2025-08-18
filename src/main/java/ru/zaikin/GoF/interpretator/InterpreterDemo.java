package ru.zaikin.GoF.interpretator;

public class InterpreterDemo {
    public static void main(String[] args) {
        Application application = new Application(750, 40000, 6);

        Expression rule = new AndExpression(
                new ScoreExpression(700),

                new OrExpression(
                        new IncomeExpression(50000),
                        new ClientSinceExpression(5)
                )
        );

        boolean approved = rule.interpret(application);
        System.out.println("Application approved? " + approved);
    }
}
