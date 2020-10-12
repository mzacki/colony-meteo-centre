package com.colony.cmc.service;

import com.colony.cmc.dto.WtsResponse;
import com.colony.cmc.rest.wts.WtsFeignClient;
import com.colony.cmc.security.ApiKeyStoreProperties;
import com.colony.cmc.utils.WtsQueryParams;
import org.springframework.stereotype.Service;

@Service
public class WtsService {

    private final WtsFeignClient client;
    private final ApiKeyStoreProperties apiKeyStore;
    private final WtsQueryParams params;

    public WtsService(WtsFeignClient client, ApiKeyStoreProperties apiKeyStore,
            WtsQueryParams params) {
        this.client = client;
        this.apiKeyStore = apiKeyStore;
        this.params = params;
    }

    public WtsResponse getConditions() {
        return client.getConditions(apiKeyStore.getWts().getKey(), params.getQuery());
    }

}
