package ru.zaikin.GoF.adapter;

// Предположим, мы не можем менять этот класс
public class ExternalBkiService {
    // возвращает карту с данными вместо нашего CreditHistory
    public java.util.Map<String, Integer> fetchClientHistory(String clientId) {
        return java.util.Map.of(
                "score", 720,
                "overdue", 1
        );
    }
}
