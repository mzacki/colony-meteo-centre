package com.colony.cmc.service;

import com.colony.cmc.dto.AcwResponse;
import com.colony.cmc.rest.acw.AcwFeignClient;
import com.colony.cmc.security.ApiKeyStoreProperties;
import com.colony.cmc.utils.AcwQueryParams;
import org.springframework.stereotype.Service;

@Service
public class AcwService {

    private final AcwFeignClient client;
    private final ApiKeyStoreProperties apiKeyStore;
    private final AcwQueryParams params;

    public AcwService(AcwFeignClient client, ApiKeyStoreProperties apiKeyStore,
            AcwQueryParams params) {
        this.client = client;
        this.apiKeyStore = apiKeyStore;
        this.params = params;
    }

    public AcwResponse[] getConditions() {
        return client.getConditions(params.getLoc(), apiKeyStore.getAcw().getKey(), true);
    }

}
