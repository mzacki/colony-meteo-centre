package com.colony.cmc.rest.icm;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class IcmHystrixFallbackFactory implements FallbackFactory<IcmFeignClient> {

    @Override
    public IcmFeignClient create(Throwable throwable) {
        return new IcmHystrixFallback(throwable);
    }

}
