package com.colony.cmc.service;

import com.colony.cmc.dto.Weather;
import com.colony.cmc.rest.owm.OwmFeignClient;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwmService {

    private final OwmFeignClient client;
    private static final Double LAT = 50.09;
    private static final Double LON = 14.42;
    private static final String KEY = "***REMOVED***";
    private static final String METRIC ="metric";


    @Autowired
    public OwmService(OwmFeignClient client) {
        this.client = client;
    }

    public Weather getConditions() {
        return client.getConditions(LAT, LON, KEY, METRIC);
    }
}
