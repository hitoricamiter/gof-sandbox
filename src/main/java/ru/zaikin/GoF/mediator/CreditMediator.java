package ru.zaikin.GoF.mediator;

class CreditMediator implements Mediator {
    private ApplicationService appService;
    private ScoringService scoringService;
    private DecisionService decisionService;

    public void setApplicationService(ApplicationService appService) {
        this.appService = appService;
    }

    public void setScoringService(ScoringService scoringService) {
        this.scoringService = scoringService;
    }

    public void setDecisionService(DecisionService decisionService) {
        this.decisionService = decisionService;
    }

    @Override
    public void notify(Object sender, String event) {
        if (event.equals("ApplicationReceived")) {
            scoringService.calculateScore(appService.getApplication());
        } else if (event.equals("ScoreCalculated")) {
            decisionService.makeDecision(scoringService.getScore());
        }
    }
}
