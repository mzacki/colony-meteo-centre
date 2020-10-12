package com.colony.cmc.rest.wts;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class WtsHystrixFallbackFactory implements FallbackFactory<WtsFeignClient> {

    @Override
    public WtsFeignClient create(Throwable throwable) {
        return new WtsHystrixFallback(throwable);
    }
}
