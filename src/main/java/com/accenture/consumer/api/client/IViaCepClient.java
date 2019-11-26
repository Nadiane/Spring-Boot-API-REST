package com.accenture.consumer.api.client;

import com.accenture.consumer.api.dto.ViaCepDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(url = "https://viacep.com.br/ws", name = "viacep.com.br")
public interface IViaCepClient {

    @GetMapping("/{cep}/json/")
    ViaCepDto getViaCep(@PathVariable(value = "cep") String cep);

}
