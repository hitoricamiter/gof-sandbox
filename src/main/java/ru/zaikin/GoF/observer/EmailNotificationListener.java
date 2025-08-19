package ru.zaikin.GoF.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        System.out.println("EmailNotificationListener received order created event" + event.getOrderId());
    }

}
