package com.sachin.rsocket.server.controller;

import com.sachin.protobuf.payloads.request.SimpleRequest;
import com.sachin.protobuf.payloads.response.SimpleResponse;
import com.sachin.rsocket.server.service.SimpleServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

/**
 * @author Sachin.Shakya
 * @since 03-Apr-2022, Sunday 1:09 PM
 */
@Slf4j
@Controller
@AllArgsConstructor
@MessageMapping(value = "simple")
public class SimpleController {

    private final SimpleServiceImpl simpleServiceImpl;

    @MessageMapping(value = "rr")
    public Mono<SimpleResponse> requestResponse(Mono<SimpleRequest> simpleRequest) {
        return simpleRequest.flatMap(simpleServiceImpl::requestReply);
    }

}