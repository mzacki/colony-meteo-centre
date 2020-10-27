package com.colony.cmc.rest.icm;

import com.colony.cmc.dto.IcmResponse;
import feign.codec.DecodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IcmHystrixFallback implements IcmFeignClient{

    private static final Logger LOG = LoggerFactory.getLogger(IcmHystrixFallback.class);
    private final Throwable cause;

    public IcmHystrixFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public IcmResponse getConditions(String model, String grid, String coordiantes, String field, String level,
            String date) {
        LOG.error("FeignException - Getting weather conditions from ICM failed");
        if (cause instanceof DecodeException) {
            LOG.error("DecodeException - Getting weather conditions from ICM failed");
        } else if (cause instanceof RuntimeException) {
            LOG.error("RuntimeException - Getting weather conditions from ICM failed");
        }
        return null;
    }

}
