package ru.zaikin.GoF.composite;

public class AgeRule implements Rule{
    @Override
    public boolean check(Application application) {
        return application.getAge() >= 18;
    }
}
