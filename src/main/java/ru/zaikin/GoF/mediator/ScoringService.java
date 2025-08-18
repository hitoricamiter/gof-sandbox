package ru.zaikin.GoF.mediator;

public class ScoringService {
    private Mediator mediator;
    private int score;

    public ScoringService(Mediator mediator) {
        this.mediator = mediator;
    }

    public void calculateScore(Application application) {
        score = application.getCreditScore();
        System.out.println("Score: " + score);
        mediator.notify(this, "ScoreCalculated");
    }

    public int getScore() {
        return score;
    }
}
