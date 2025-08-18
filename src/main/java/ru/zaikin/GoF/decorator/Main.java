package ru.zaikin.GoF.decorator;

public class Main {
    public static void main(String[] args) {
        Application app = new Application("Bob", 30, 60000, true, 0.9);

        Scoring base = new BaseScoring();

        // оборачиваем базовый скоринг декораторами
        Scoring decorated = new LatePaymentPenaltyDecorator(
                new MacroFactorDecorator(base));

        double finalScore = decorated.calculate(app);
        System.out.println("Final scoring: " + finalScore);
    }
}

/*
* Посредством создания оберток над основным декоратором мы можем реализовывать дополнительные функции не изменяя основной код
*  Мы делаем иерархию оберток, начало это base, затем мы делаем новую фичу в MacroFactor, вызываем Base метод + добавляем новый
* Проделываем тоже самое в LatePayment и получаем конечный результат
* */