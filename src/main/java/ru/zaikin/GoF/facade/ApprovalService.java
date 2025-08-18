package ru.zaikin.GoF.facade;

public class ApprovalService {
    public String approve(double score) {
        String decision = score > 50000 ? "Good" : "Bad";
        System.out.println("Принято решение: " + decision);
        return decision;
    }
}
