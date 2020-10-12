package com.colony.cmc.rest.wts;


import com.colony.cmc.dto.OwmResponse;
import feign.codec.DecodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WtsHystrixFallback implements WtsFeignClient {

    private static final Logger LOG = LoggerFactory.getLogger(WtsHystrixFallback.class);
    private final Throwable cause;

    public WtsHystrixFallback(Throwable cause) {
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
