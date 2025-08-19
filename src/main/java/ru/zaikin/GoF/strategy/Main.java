package ru.zaikin.GoF.strategy;

public class Main {
    public static void main(String[] args) {
        Client newClient = new Client("NEW", 1000, 50);
        Client vipClient = new Client("VIP", 5000, 90);

        ScoringService scoringService = new ScoringService();

        scoringService.setStrategy(new NewClientScoring());
        System.out.println("New client score: " + scoringService.score(newClient));

        scoringService.setStrategy(new VipClientScoring());
        System.out.println("VIP client score: " + scoringService.score(vipClient));
    }
}


/*
Вывод:

Код ScoringService остаётся чистым.

Легко добавлять новые алгоритмы без изменений основной логики.

Можно динамически менять стратегию в зависимости от типа клиента, времени, типа кредита и т.д.
*/
