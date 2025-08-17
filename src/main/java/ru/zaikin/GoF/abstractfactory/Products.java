package ru.zaikin.GoF.abstractfactory;

public class Products {



    // Web интерфейс
    static class WebButton implements Button {
        public void render() {
            System.out.println("Отображаем Web кнопку");
        }
    }

    static class WebTextField implements TextField {
        public void render() {
            System.out.println("Отображаем Web текстовое поле");
        }
    }

    // Mobile интерфейс
    static class MobileButton implements Button {
        public void render() {
            System.out.println("Отображаем Mobile кнопку");
        }
    }

    static class MobileTextField implements TextField {
        public void render() {
            System.out.println("Отображаем Mobile текстовое поле");
        }
    }

}
