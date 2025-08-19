package ru.zaikin.GoF.templatemethod;

public abstract class LoanApplicationProcessor {

    public final void processApplication(Client client) {
        validateClientData(client);
        double score = calculateScore(client);
        makeDecision(score);
        sendNotification(client);
    }

    protected abstract void validateClientData(Client client);
    protected abstract double calculateScore(Client client);
    protected abstract void makeDecision(double score);
    protected abstract void sendNotification(Client client);
}
