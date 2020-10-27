package com.colony.cmc.rest.icm;

import com.colony.cmc.dto.IcmResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "icm", url = "${icm.url}", fallbackFactory = IcmHystrixFallbackFactory.class)
public interface IcmFeignClient {

    @GetMapping("/model/{model}/grid/{grid}/coordinates/{coordinates}/field/{field}/"
            + "level/{level}/date/{date}/forecast/")
    IcmResponse getConditions(@PathVariable("model") String model,
            @PathVariable("grid") String grid, @PathVariable("coordinates") String coordiantes,
            @PathVariable("field") String field, @PathVariable("level") String level,
            @PathVariable("date") String date);

}
