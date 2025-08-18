package ru.zaikin.GoF.mediator;

public class ApplicationService {
    private Mediator mediator;
    private Application application;

    public ApplicationService(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveApplication(Application application) {
        this.application = application;
        System.out.println("Application received " + application.getId());
        mediator.notify(application, "Application received");
    }

    public Application getApplication() {
        return application;
    }


}
