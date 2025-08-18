package ru.zaikin.GoF.interpretator;

public class ClientSinceExpression implements Expression {

    private final int years;

    public ClientSinceExpression(int years) {
        this.years = years;
    }

    @Override
    public boolean interpret(Application application) {
        return application.getClientSince() >= years;
    }
}
