package com.sachin.rsocket.server.service;

import com.sachin.protobuf.payloads.request.SimpleRequest;
import com.sachin.protobuf.payloads.response.SimpleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author Sachin.Shakya
 * @since 03-Apr-2022, Sunday 1:24 PM
 */
@Slf4j
@Service
public class SimpleServiceImpl {

    public Mono<SimpleResponse> requestReply(SimpleRequest simpleRequest) {
        return Mono.fromSupplier(() -> SimpleResponse.newBuilder()
                .setResponseMessage("Hello " + simpleRequest.getRequestMessage())
                .build());
    }

}
