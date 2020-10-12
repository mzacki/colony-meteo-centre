package com.colony.cmc.service;

import com.colony.cmc.dto.OwmResponse;
import com.colony.cmc.rest.owm.OwmFeignClient;
import com.colony.cmc.security.ApiKeyStoreProperties;
import com.colony.cmc.utils.OwmQueryParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwmService {

    private final OwmFeignClient client;
    private final ApiKeyStoreProperties apiKeyStore;
    private final OwmQueryParams params;

    @Autowired
    public OwmService(OwmFeignClient client, ApiKeyStoreProperties apiKeyStore, OwmQueryParams params) {
        this.client = client;
        this.apiKeyStore = apiKeyStore;
        this.params = params;
    }

    public OwmResponse getConditions() {
        return client.getConditions(params.getLatitude(), params.getLongitude(), apiKeyStore.getOwm().getKey(), params.getMetric());
    }
}
