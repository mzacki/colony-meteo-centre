package com.colony.cmc.rest.owm;

import com.colony.cmc.dto.OwmResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "owm", url = "${owm.url}", fallbackFactory = OwmHystrixFallbackFactory.class)
public interface OwmFeignClient {

    @GetMapping()
    OwmResponse getConditions(@RequestParam("lat") Double latitude,
            @RequestParam("lon") Double longitude,
            @RequestParam("appid") String key,
            @RequestParam("units") String units);

}
