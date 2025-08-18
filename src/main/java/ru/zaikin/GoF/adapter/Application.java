package ru.zaikin.GoF.adapter;

public class Application {
        public static void main(String[] args) {
            CreditHistoryProvider provider = new BkiAdapter(new ExternalBkiService());
            ScoringEngine engine = new ScoringEngine(provider);
            engine.calculateScore("12345");
        }
    }