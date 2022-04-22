package com.sachin.rsocket.broker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Hooks;

/**
 * @author Sachin.Shakya
 * @since 06-Apr-2022, Friday 11:37 PM
 */
@SpringBootApplication
public class RSocketBrokerApplication {

    public static void main(String[] args) {
        Hooks.onOperatorDebug();
        SpringApplication.run(RSocketBrokerApplication.class, args);
    }

}