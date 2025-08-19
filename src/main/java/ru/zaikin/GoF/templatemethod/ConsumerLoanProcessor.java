package ru.zaikin.GoF.templatemethod;

public class ConsumerLoanProcessor extends LoanApplicationProcessor{
    @Override
    protected void validateClientData(Client client) {
        System.out.println("Проверка данных для кредита " + client.getName());
    }

    @Override
    protected double calculateScore(Client client) {
        System.out.println("Расчет скоринга для потребительского кредита");
        return client.getIncome() * 0.5;
    }

    @Override
    protected void makeDecision(double score) {
        if (score > 500) {
            System.out.println("Заявка одобрена");
        } else {
            System.out.println("Заявка отклонена");
        }
    }

    @Override
    protected void sendNotification(Client client) {
        System.out.println("Отправка уведомления клиенту: " + client.getName());
    }
}
