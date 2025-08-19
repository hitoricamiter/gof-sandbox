package ru.zaikin.GoF.strategy;

public class NewClientScoring implements ScoringStrategy {
    @Override
    public double calculateScore(Client client) {
        return client.getIncome() * 0.5;
    }
}
