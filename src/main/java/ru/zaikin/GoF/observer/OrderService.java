package ru.zaikin.GoF.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void createOrder(String orderId) {
        System.out.println("Creating order " + orderId);
        publisher.publishEvent(new OrderCreatedEvent(this, orderId));
    }
}
