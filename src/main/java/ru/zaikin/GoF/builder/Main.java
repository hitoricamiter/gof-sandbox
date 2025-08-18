package ru.zaikin.GoF.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .firstName("Иван")
                .lastName("Иванов")
                .age(30)
                .email("ivan@example.com")
                .build();

        System.out.println(user);
    }
}
