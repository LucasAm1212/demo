package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@Slf4j
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://scheduler?period=3s").log("Aguardando leitura de arquivo");

        from("file://C:\\Users\\lucas\\Desktop\\API\\Arquivo").convertBodyTo(String.class)
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                log.info(exchange.getIn().getBody(String.class));
            }
        });

    }
}
