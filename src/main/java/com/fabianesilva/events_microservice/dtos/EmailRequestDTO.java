package com.fabianesilva.events_microservice.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
    //Nenhum construtor, getter ou setter são necessários,
    //pois o 'record' gera automaticamente esses métodos imutáveis.
}
