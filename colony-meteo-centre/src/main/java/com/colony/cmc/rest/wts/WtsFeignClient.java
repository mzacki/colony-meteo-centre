package com.colony.cmc.rest.wts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "wts", url = "${wts.url}", fallbackFactory = WtsHystrixFallbackFactory.class)
public interface WtsFeignClient {

    @GetMapping("/current")
    WtsResponse getConditions(@RequestParam("access_key") String key,
            @RequestParam("query") String query);

}
