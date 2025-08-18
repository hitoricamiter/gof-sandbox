package ru.zaikin.GoF.composite;

public class Main {
    public static void main(String[] args) {
        Application app = new Application("Alice", 25, 60000);

        Rule incomeRule = new IncomeRule();
        Rule ageRule = new AgeRule();

        CompositeRule compositeRule = new CompositeRule();
        compositeRule.addRule(incomeRule);
        compositeRule.addRule(ageRule);

        boolean passed = compositeRule.check(app);
        System.out.println("Application passed rules: " + passed);
    }
}

/*
*
*   Простые правила (IncomeRule, AgeRule) и составные (CompositeRule) используют один интерфейс Rule.

    Можно динамически создавать комбинации правил, не создавая новые классы под каждую комбинацию.

    Код легко расширять: добавляем новые простые правила, комбинируем их в CompositeRule
*
* */