package ru.zaikin.GoF.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObserverSpringExample {

    public static void main(String[] args) {
        SpringApplication.run(ObserverSpringExample.class, args);
    }

    @Bean
    CommandLineRunner runner(OrderService orderService) {
        return args -> {
            orderService.createOrder("ORD-123");
        };
    }
}
