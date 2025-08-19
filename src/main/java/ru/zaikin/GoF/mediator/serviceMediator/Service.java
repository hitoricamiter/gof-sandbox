package ru.zaikin.GoF.mediator.serviceMediator;

public abstract class Service {
    protected ScoringMediator mediator;

    public Service(ScoringMediator mediator) {
        this.mediator = mediator;
    }
}
