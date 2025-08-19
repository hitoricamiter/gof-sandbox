package ru.zaikin.GoF.mediator.serviceMediator;

public class ScoringCoordinator implements ScoringMediator {
    private CreditHistoryChecker history;
    private IncomeChecker income;
    private DocumentChecker docs;

    public ScoringCoordinator() {
        this.history = new CreditHistoryChecker(this);
        this.income = new IncomeChecker(this);
        this.docs = new DocumentChecker(this);
    }

    public void start() {
        history.checkHistory();
    }

    @Override
    public void notify(Service sender, String event) {
        if (event.equals("history_ok")) {
            income.checkIncome();
        } else if (event.equals("income_ok")) {
            docs.checkDocs();
        } else if (event.equals("docs_ok")) {
            System.out.println("✅ Все проверки пройдены! Заявка одобрена");
        }
    }
}