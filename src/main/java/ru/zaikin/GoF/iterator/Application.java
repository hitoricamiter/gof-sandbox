package ru.zaikin.GoF.iterator;

public class Application {
    private String id;
    private int score;

    public Application(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }
}
