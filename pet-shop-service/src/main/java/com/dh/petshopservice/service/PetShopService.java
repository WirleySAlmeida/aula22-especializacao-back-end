package com.dh.petshopservice.service;

import com.dh.petshopservice.domain.repository.FinanceiroFeignClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Service;

@Service
public class PetShopService {

    private final FinanceiroFeignClient cliente;

    public PetShopService(FinanceiroFeignClient cliente) {
        this.cliente = cliente;
    }
}
