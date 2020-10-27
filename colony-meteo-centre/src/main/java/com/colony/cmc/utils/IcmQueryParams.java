package com.colony.cmc.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IcmQueryParams {

    @Autowired
    private IcmQueryParams() {}

    public static final String MODEL = "coamps";
    public static final String GRID = "2a";
    public static final String COORDINATES = "130"+","+"111";
    public static final String FIELD = "airtmp_pre_fcstfld";
    public static final String LEVEL = "000010_000000";
    public static final String DATE = "2020-01-01T12";

}
