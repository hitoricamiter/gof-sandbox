package ru.zaikin.GoF.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Application application = new Application("Ivan", 60, false, 600_000);

        // Настройка цепочки
        CreditScoreHandler creditScore = new CreditScoreHandler();
        FraudCheckHandler fraudCheck = new FraudCheckHandler();
        AmountCheckHandler amountCheck = new AmountCheckHandler();

        creditScore.setNext(fraudCheck);
        fraudCheck.setNext(amountCheck);

        // Обработка заявки
        creditScore.handle(application);
    }
}
