package ru.zaikin.GoF.chainOfResponsibility;

public abstract class ApplicationHandler {
    protected ApplicationHandler next;

    public void setNext (ApplicationHandler next) {
        this.next = next;
    }

    public abstract void handle(Application application);

}
