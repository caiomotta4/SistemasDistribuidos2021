package br.com.rabbit;

import br.com.model.Morador;
import br.com.service.MoradorService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MoradorConsumer {

    @Autowired
    private MoradorService moradorService;

    @RabbitListener(queues = {"${queue.morador.name}"})
    public void receive (@Payload Morador morador){
        System.out.println("Id: "+ morador.get_id() + "\nNome: " + morador.getName());
        moradorService.save(morador);
    }
}