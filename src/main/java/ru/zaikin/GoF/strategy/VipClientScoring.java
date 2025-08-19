package ru.zaikin.GoF.strategy;

public class VipClientScoring implements ScoringStrategy{
    @Override
    public double calculateScore(Client client) {
        return client.getIncome() * 1.2 + client.getCreditHistoryScore();
    }
}
