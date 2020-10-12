package com.colony.cmc.rest.acw;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class AcwHystrixFallbackFactory implements FallbackFactory<AcwFeignClient> {

    @Override
    public AcwFeignClient create(Throwable throwable) {
        return new AcwHystrixFallback(throwable);
    }
}
