package ironcoding.rabbitmqapi.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @RabbitListener(queues = {"${ironcoding.queue.name}"})
    public void receive(@Payload String message) throws InterruptedException {
        log.info("Received message: [{}]", message);
        Thread.sleep(7000);
    }
    
}
