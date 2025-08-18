package ru.zaikin.GoF.adapter;

public interface CreditHistoryProvider {
    CreditHistory getCreditHistory(String clientId);
}
