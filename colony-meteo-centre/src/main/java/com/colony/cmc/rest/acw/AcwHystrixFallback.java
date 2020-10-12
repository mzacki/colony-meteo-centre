package com.colony.cmc.rest.acw;

import com.colony.cmc.dto.AcwResponse;
import feign.codec.DecodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcwHystrixFallback implements AcwFeignClient {

    private static final Logger LOG = LoggerFactory.getLogger(AcwHystrixFallback.class);
    private final Throwable cause;

    public AcwHystrixFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public AcwResponse[] getConditions(String location, String key, boolean details) {
        LOG.error("FeignException - Getting weather conditions from Accuweather failed");
        if (cause instanceof DecodeException) {
            LOG.error("DecodeException - Getting weather conditions from Accuweather failed");
        } else if (cause instanceof RuntimeException) {
            LOG.error("RuntimeException - Getting weather conditions from Accuweather failed");
        }
        return null;
    }

}
