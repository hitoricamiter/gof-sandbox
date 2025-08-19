package ru.zaikin.GoF.templatemethod;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", 1500);
        LoanApplicationProcessor processor = new ConsumerLoanProcessor();
        processor.processApplication(client);
    }
}

/*
Наш основной метод остается финальным с прописанными абстрактными методами, а в наследнике
мы переопределяем конкретно методы
*/
