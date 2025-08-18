package ru.zaikin.GoF.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LoanTypeFactory {

    private final static Map<String, LoanType> types = new HashMap<>();

    public static LoanType getLoanType(String typeName) {
        if (!types.containsKey(typeName)) {
            types.put(typeName, new LoanType(typeName));
        }
        return types.get(typeName);
    }

}
