package ru.zaikin.GoF.flyweight;

public class LoanType {
    private final String typeName;

    public LoanType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
