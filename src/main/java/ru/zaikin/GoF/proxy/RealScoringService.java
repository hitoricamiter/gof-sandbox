package ru.zaikin.GoF.proxy;

public class RealScoringService implements ScoringService {

    @Override
    public int calculateScore(String applicationId) {
        System.out.println("Calculate score for " + applicationId);
        // heavy logic (ML or request API)
        return (int) (Math.random() * 100);
    }
}
