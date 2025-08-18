package ru.zaikin.GoF.decorator;

public class MacroFactorDecorator extends ScoringDecorator{
    public MacroFactorDecorator(Scoring decoratedScoring) {
        super(decoratedScoring);
    }

    @Override
    public double calculate(Application app) {
        double score = super.calculate(app);
        // корректируем балл на макрофактор
        return score * app.getMacroFactor();
    }
}
