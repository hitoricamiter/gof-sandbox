package ru.zaikin.GoF.chainOfResponsibility;

public class FraudCheckHandler extends ApplicationHandler {

    @Override
    public void handle(Application application) {
        if (application.isFraudSuspicion) {
            System.out.println(application.applicantId + " flagged for fraud review");
            return;
        }
        if (next != null) next.handle(application);
    }

}
