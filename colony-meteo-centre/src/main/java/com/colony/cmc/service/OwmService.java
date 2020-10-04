package com.colony.cmc.service;

import com.colony.cmc.rest.owm.OwmFeignClient;

@Service
public class OwmService {

    private final OwmFeignClient client;

    @Autowired
    public OwmService(OwmFeignClient client) {
        this.client = client;
    }

    public Optional<Conditions> getConditions(Double latitude, Double longitude, String key, String units) {
        return client.getConditions();
    }
}
