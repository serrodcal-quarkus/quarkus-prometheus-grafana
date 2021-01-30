package com.serrodcal.poc;

import io.quarkus.vertx.web.Route;
import io.smallrye.mutiny.Uni;
import io.vertx.core.http.HttpMethod;

import javax.inject.Singleton;

@Singleton
public class GreetingResource {

    @Route(path = "/hello", methods = HttpMethod.GET)
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello!");
    }
    
}