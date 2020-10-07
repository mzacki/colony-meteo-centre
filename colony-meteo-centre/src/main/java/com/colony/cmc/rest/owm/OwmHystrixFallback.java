package com.colony.cmc.rest.owm;


import com.colony.cmc.dto.OwmResponse;
import feign.codec.DecodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OwmHystrixFallback implements OwmFeignClient {

    private static final Logger LOG = LoggerFactory.getLogger(OwmHystrixFallback.class);
    private final Throwable cause;

    public OwmHystrixFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public OwmResponse getConditions(Double latitude, Double longitude, String key, String units) {
        LOG.error("FeignException - Getting weather conditions from OWM failed");
        if (cause instanceof DecodeException) {
            LOG.error("DecodeException - Getting weather conditions from OWM failed");
        } else if (cause instanceof RuntimeException) {
            LOG.error("RuntimeException - Getting weather conditions from OWM failed");
        }
        return null;
    }
}
