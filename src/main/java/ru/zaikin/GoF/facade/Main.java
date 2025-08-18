package ru.zaikin.GoF.facade;

public class Main {
    public static void main(String[] args) {
        LoanApplication app = new LoanApplication("Иван", 70000);
        LoadProcessingFacade facade = new LoadProcessingFacade();
        facade.processLoan(app);
    }
}

/*
*
* Делаем цепочку из микросервисов и внутри реализовываем логику, 1 методом вызываем весь пайплайн
*
* Работает с несколькими сервисами или подсистемами, которые не имеют общего интерфейса.

Предоставляет упрощённый единый метод, скрывая сложную последовательность действий.
* */