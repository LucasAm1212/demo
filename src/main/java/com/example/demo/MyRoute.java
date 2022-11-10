package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@Slf4j
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //JacksonDataFormat notaDataFormat = new JacksonDataFormat(.class);

        from("timer://scheduler?period=5s")
                .transform().simple("{\"nome\" : \"Lucas\",\"idade\" : 22}")
                        .to("direct:converteJson");

        //from("file://C:\\Users\\lucas\\Desktop\\API\\Arquivo")
                //.convertBodyTo(String.class)
                //.to("direct:consomeString");

        from("direct:converteJson")
                .unmarshal().json(JsonLibrary.Jackson, Aluno.class)
                        .process(new Processor() {
                            @Override
                            public void process(Exchange exchange) throws Exception {
                                log.info(exchange.getIn().getBody(String.class));
                                Aluno aluno = exchange.getIn().getBody(Aluno.class);
                            }
                        });

        from("direct:consomeString")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                log.info(exchange.getIn().getBody(String.class));
            }
        });

    }
}
