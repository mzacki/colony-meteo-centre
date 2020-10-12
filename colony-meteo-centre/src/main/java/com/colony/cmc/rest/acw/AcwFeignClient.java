package com.colony.cmc.rest.acw;

import com.colony.cmc.dto.AcwResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "acw", url = "${acw.url}", fallbackFactory = AcwHystrixFallbackFactory.class)
public interface AcwFeignClient {

    @GetMapping("/{location}")
    AcwResponse[] getConditions(@PathVariable("location") String location,
            @RequestParam("apikey") String key,
            @RequestParam(value = "details", required = false) boolean details);

}
