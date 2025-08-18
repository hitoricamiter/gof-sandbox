package ru.zaikin.GoF.adapter;

public class ScoringEngine {
    private final CreditHistoryProvider creditHistoryProvider;

    public ScoringEngine(CreditHistoryProvider creditHistoryProvider) {
        this.creditHistoryProvider = creditHistoryProvider;
    }

    public void calculateScore(String clientId) {
        CreditHistory history = creditHistoryProvider.getCreditHistory(clientId);
        System.out.println("Скоринг для клиента: " + clientId
                + ", score=" + history.score
                + ", overdue=" + history.overduePayments);
    }
}