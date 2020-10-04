package com.colony.cmc.rest.owm;

//import org.graalvm.compiler.lir.CompositeValue.Component;
import org.springframework.stereotype.Component;

@Component
public class OwmHystrixFallbackFactory implements FallbackFactory<OwmFeignClient>{

    @Override
    public OwmFeignClient create(Throwable throwable) {
        return new OwmHystrixFallback(throwable);
    }
}
