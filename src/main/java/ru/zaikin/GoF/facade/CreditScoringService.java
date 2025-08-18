package ru.zaikin.GoF.facade;

public class CreditScoringService {
    public double score(LoanApplication application) {
        double score = application.getRequestedAmount() * 0.8;
        System.out.println("Скоринг рассчитан: " + score);
        return score;
    }
}
