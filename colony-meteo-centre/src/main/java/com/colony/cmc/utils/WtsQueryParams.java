package com.colony.cmc.utils;

import org.springframework.stereotype.Component;

@Component
public class WtsQueryParams {

    private static final String QUERY = "49.7497638, 18.6354709";

    public String getQuery() {
        return QUERY;
    }
}
