package ru.zaikin.GoF.chainOfResponsibility;

public class CreditScoreHandler extends ApplicationHandler{

    @Override
    public void handle(Application application) {
        if (application.creditScore < 50) {
            System.out.println(application.applicantId + " rejected: low credit score");
            return;
        }
        if (next != null) next.handle(application);
    }
}
