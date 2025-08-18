package ru.zaikin.GoF.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    // приватный конструктор (чтобы нельзя было создать напрямую)
    private User() {}

    public static class Builder {
        private final User user = new User();

        public Builder firstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            user.age = age;
            return this;
        }

        public Builder email(String email) {
            user.email = email;
            return this;
        }

        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age: " + age + ", email: " + email;
    }
}
