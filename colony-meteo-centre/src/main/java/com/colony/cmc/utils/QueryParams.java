package com.colony.cmc.utils;

import org.springframework.stereotype.Component;

@Component
public class QueryParams {

    private static final Double LAT = 50.09;
    private static final Double LON = 14.42;
    private static final String METRIC ="metric";


    public Double getLatitude() {
        return LAT;
    }

    public Double getLongitude() {
        return LON;
    }

    public String getMetric() {
        return METRIC;
    }
}
