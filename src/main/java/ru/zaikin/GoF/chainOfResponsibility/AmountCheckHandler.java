package ru.zaikin.GoF.chainOfResponsibility;

public class AmountCheckHandler extends ApplicationHandler {
    @Override
    public void handle(Application application) {
        if (application.amount > 500_000) {
            System.out.println(application.applicantId + " required manual approval for large");
            return;
        }
        if (next != null) next.handle(application);
    }
}
