package ru.zaikin.GoF.decorator;

public class BaseScoring implements Scoring {
    @Override
    public double calculate(Application application) {
        return application.getIncome() * 0.5 + application.getAge() * 1.0;
    }
}
