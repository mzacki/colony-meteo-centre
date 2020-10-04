package com.colony.cmc.rest.owm;

@FeignClient(name = "owm", url = "${owm.url)", fallbackFactory = OwmHystrixFallbackFactory.class)
public interface OwmFeignClient {

    @GetMapping()
    JsonResponse getConditions(@RequestParam("lat") Double latitude,
            @RequestParam("lon") Double longitude,
            @RequestParam("appid") String key,
            @RequestParam("units") String units);

}
