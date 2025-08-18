package ru.zaikin.GoF.mediator;

class Application {
    private final String id;
    private final int creditScore;

    public Application(String id, int creditScore) {
        this.id = id;
        this.creditScore = creditScore;
    }

    public String getId() {
        return id;
    }

    public int getCreditScore() {
        return creditScore;
    }
}
