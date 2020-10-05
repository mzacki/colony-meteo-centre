package com.colony.cmc.rest.owm;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class OwmHystrixFallbackFactory implements FallbackFactory<OwmFeignClient> {

    @Override
    public OwmFeignClient create(Throwable throwable) {
        return new OwmHystrixFallback(throwable);
    }
}
