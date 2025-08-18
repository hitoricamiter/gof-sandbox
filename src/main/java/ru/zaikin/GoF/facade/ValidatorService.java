package ru.zaikin.GoF.facade;

public class ValidatorService {
    public boolean validate(LoanApplication application) {
        System.out.println("Валидация заявки: " + application.getApplicationName());
        return application.getRequestedAmount() > 0;
    }
}
