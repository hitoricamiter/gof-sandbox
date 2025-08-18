package ru.zaikin.GoF.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRule implements Rule{

    private List<Rule> rules = new ArrayList<>();

    public void addRule(Rule rule) {
        rules.add(rule);
    }



    @Override
    public boolean check(Application application) {
        for (Rule rule : rules) {
            if (!rule.check(application)) {
                return false;
            }
        }
        return true;
    }
}
