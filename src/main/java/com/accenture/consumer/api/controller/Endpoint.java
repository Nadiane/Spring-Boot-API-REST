package com.accenture.consumer.api.controller;

import com.accenture.consumer.api.client.IViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/endpoint")
public class Endpoint {

    private IViaCepClient viaCepClient;

    @Autowired
    public Endpoint(IViaCepClient pViaCepClient) {
        this.viaCepClient = pViaCepClient;
    }

    @GetMapping("/feign/{cep}")
    public ResponseEntity<?> testFeign(@PathVariable(value="cep") String cep) {
        return ResponseEntity.ok(this.viaCepClient.getViaCep(cep));
    }

}
