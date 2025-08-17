package ru.zaikin.GoF.abstractfactory;

public class WebFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new Products.WebButton();
    }

    @Override
    public TextField createTextField() {
        return new Products.WebTextField();
    }
}
