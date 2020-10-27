package com.colony.cmc.enums;

public enum Provider {

    ACCUWEATHER(1L),
    ICM_METEO(2L),
    OPEN_WEATHER_MAP(3L),
    RASPBERRY_PI(0L),
    WEATHERSTACK(4L),
    YAHOO(5L);

    private long id;

    Provider(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
