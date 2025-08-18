package ru.zaikin.GoF.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        CreditMediator mediator = new CreditMediator();

        ApplicationService appService = new ApplicationService(mediator);
        ScoringService scoringService = new ScoringService(mediator);
        DecisionService decisionService = new DecisionService();

        mediator.setApplicationService(appService);
        mediator.setScoringService(scoringService);
        mediator.setDecisionService(decisionService);

        Application app = new Application("A1", 750);
        appService.receiveApplication(app);
    }
}

/*
*
*   ApplicationService --|
                     |--> Mediator --> ScoringService
    ScoringService ------|
                     |--> Mediator --> DecisionService
    DecisionService -----|

* */
