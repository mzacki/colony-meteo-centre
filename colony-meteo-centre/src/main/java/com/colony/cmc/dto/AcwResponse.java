package com.colony.cmc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcwResponse {

    @JsonProperty("WeatherText")
    private String weatherText;

    @JsonProperty("Temperature")
    private Temperature temperature;

    private static class Temperature {

        @JsonProperty("Metric")
        private Metric metric;

        private static class Metric {

            @JsonProperty("Value")
            private double value;
        }
    }
}
