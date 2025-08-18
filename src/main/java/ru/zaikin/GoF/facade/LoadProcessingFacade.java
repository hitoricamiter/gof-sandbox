package ru.zaikin.GoF.facade;

public class LoadProcessingFacade {
    private ValidatorService validator = new ValidatorService();
    private CreditScoringService scoring = new CreditScoringService();
    private ApprovalService approval = new ApprovalService();
    private MessagingService messaging = new MessagingService();

    public void processLoan(LoanApplication application) {
        if (!validator.validate(application)) {
            messaging.sendNotification(application.getApplicationName(), "Validation Failed");
            return;
        }

        double score = scoring.score(application);
        String decision = approval.approve(score);
        messaging.sendNotification(application.getApplicationName(), decision);

    }

}
