package com.colony.cmc.rest.owm;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class OwmHystrixFallback implements OwmFeignClient {

    private static final Logger LOG  = LoggerFactory.getLogger(OwmHystrixFallback.class);
    private static final String DECODING_FAILED = "Decoding of OWM response failed";
    private final Throwable cause;

    public OwmHystrixFallback(Throwable cause) {
        this.cause = cause;
    }
}
