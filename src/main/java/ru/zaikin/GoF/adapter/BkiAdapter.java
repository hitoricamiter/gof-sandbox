package ru.zaikin.GoF.adapter;

public class BkiAdapter implements CreditHistoryProvider {
    private final ExternalBkiService bkiService;

    public BkiAdapter(ExternalBkiService bkiService) {
        this.bkiService = bkiService;
    }

    @Override
    public CreditHistory getCreditHistory(String clientId) {
        java.util.Map<String, Integer> data = bkiService.fetchClientHistory(clientId);
        int score = data.getOrDefault("score", 0);
        int overdue = data.getOrDefault("overdue", 0);
        return new CreditHistory(score, overdue);
    }
}
