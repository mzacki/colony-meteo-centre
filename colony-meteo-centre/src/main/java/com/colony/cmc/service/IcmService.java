package com.colony.cmc.service;

import com.colony.cmc.dto.IcmResponse;
import com.colony.cmc.rest.icm.IcmFeignClient;
import com.colony.cmc.utils.IcmQueryParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IcmService {

    private final IcmFeignClient client;

    @Autowired
    public IcmService(IcmFeignClient client) {
        this.client = client;
    }

    public IcmResponse getConditions() {
        return client.getConditions(IcmQueryParams.MODEL, IcmQueryParams.GRID, IcmQueryParams.COORDINATES,
                IcmQueryParams.FIELD, IcmQueryParams.LEVEL, IcmQueryParams.DATE);
    }

}
