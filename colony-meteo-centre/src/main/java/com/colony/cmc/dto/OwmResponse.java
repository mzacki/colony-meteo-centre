package com.colony.cmc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OwmResponse {


    @JsonProperty("name")
    private String name;
    @JsonProperty("main")
    private Main main;


    private static class Main {

        @JsonProperty("temp")
        private Double temperature;
        @JsonProperty("humidity")
        private Double humidity;
    }

}
