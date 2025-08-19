package ru.zaikin.GoF.mediator.serviceMediator;

public class DocumentChecker extends Service {
    public DocumentChecker(ScoringMediator mediator) { super(mediator); }

    public void checkDocs() {
        System.out.println("Проверка документов...");
        mediator.notify(this, "docs_ok");
    }
}