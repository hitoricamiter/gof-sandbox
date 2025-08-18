package ru.zaikin.GoF.interpretator;

public class Application {
    private int score;
    private int income;
    private int clientSince;

    public Application(int score, int income, int clientSince) {
        this.score = score;
        this.income = income;
        this.clientSince = clientSince;
    }

    public int getScore() { return score; }
    public int getIncome() { return income; }
    public int getClientSince() { return clientSince; }
}

