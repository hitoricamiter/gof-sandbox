package ru.zaikin.GoF.adapter;

public class CreditHistory {
    public final int score;
    public final int overduePayments;

    public CreditHistory(int score, int overduePayments) {
        this.score = score;
        this.overduePayments = overduePayments;
    }
}
