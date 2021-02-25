package com.optionalerror.application;

import com.vaadin.flow.server.connect.Endpoint;
import com.vaadin.flow.server.connect.auth.AnonymousAllowed;

import java.io.Serializable;
import java.util.Optional;

@Endpoint
@AnonymousAllowed
public class ErrorEndpoint {

    public boolean findAll(EndpointQuery query) {
        return query.optionalField.isPresent();
    }

    public static final class EndpointQuery implements Serializable {
        public long nonOptionalField;
        public Optional<Long> optionalField;
    }
}