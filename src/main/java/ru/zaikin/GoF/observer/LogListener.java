package ru.zaikin.GoF.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class LogListener {
    @EventListener
    public void logOrder(OrderCreatedEvent event) {
        System.out.println("📝 Логируем заказ: " + event.getOrderId());
    }
}