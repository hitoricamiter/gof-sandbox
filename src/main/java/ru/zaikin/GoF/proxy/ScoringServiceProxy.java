package ru.zaikin.GoF.proxy;

import java.util.HashMap;
import java.util.Map;

public class ScoringServiceProxy implements ScoringService {

    private RealScoringService realScoringService;
    private Map<String, Integer> cache = new HashMap<String, Integer>();

    @Override
    public int calculateScore(String applicationId) {
        if (cache.containsKey(applicationId)) {
            System.out.println("returning cached score for " + applicationId);
            return cache.get(applicationId);
        }

        if (realScoringService == null) {
            realScoringService = new RealScoringService();
        }

        int score = realScoringService.calculateScore(applicationId);
        cache.put(applicationId, score);
        return score;
    }
}

/*
*  Храним ссылку на реальный объект и не обращаемся к нему до первого вызова, кешируем данные, кайфуем
*
* */