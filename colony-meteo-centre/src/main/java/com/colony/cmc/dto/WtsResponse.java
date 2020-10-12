package com.colony.cmc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WtsResponse {

    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;

    private static class Location {
        @JsonProperty("name")
        private String name;
    }

    private static class Current {
        @JsonProperty("temperature")
        private double temperature;
    }

}
