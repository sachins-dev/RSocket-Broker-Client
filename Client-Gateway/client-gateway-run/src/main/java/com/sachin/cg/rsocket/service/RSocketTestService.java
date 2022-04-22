package com.sachin.cg.rsocket.service;

import com.sachin.protobuf.payloads.request.SimpleRequest;
import com.sachin.protobuf.payloads.response.SimpleResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author Sachin.Shakya
 * @since 03-Apr-2022, Sunday 7:47 PM
 */
@Slf4j
@Service
@AllArgsConstructor
public class RSocketTestService {

    private final RSocketRequester rSocketRequester;

    public Mono<SimpleResponse> requestResponse(Mono<SimpleRequest> requestMono) {
        return this.rSocketRequester.route("sample.rr")
                .data(requestMono).retrieveMono(SimpleResponse.class);
    }

}
