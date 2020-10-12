package com.colony.cmc.utils;

import org.springframework.stereotype.Component;

@Component
public class OwmQueryParams {

    private static final Double LAT = 49.7497638;
    private static final Double LON = 18.6354709;
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
