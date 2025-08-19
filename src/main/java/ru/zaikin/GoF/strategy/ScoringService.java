package ru.zaikin.GoF.strategy;

public class ScoringService {
    private ScoringStrategy strategy;

    public void setStrategy(ScoringStrategy strategy) {
        this.strategy = strategy;
    }

    public double score(Client client) {
        return strategy.calculateScore(client);
    }
}
