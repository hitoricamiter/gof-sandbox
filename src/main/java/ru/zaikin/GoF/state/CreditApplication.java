package ru.zaikin.GoF.state;

public class CreditApplication {
    private CreditApplicationState state;
    private String id;

    public CreditApplication(String idl) {
        this.id = idl;
        this.state = new NewState();
    }

    public void setState(CreditApplicationState state) {
        this.state = state;
    }

    public void process() {
        state.process(this);
    }

    public String getId() {
        return id;
    }
}
