package com.colony.cmc.controller;

import com.colony.cmc.dto.Weather;
import com.colony.cmc.service.OwmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    private final OwmService service;

    public CheckController(OwmService service) {
        this.service = service;
    }

    @GetMapping("/check")
    public String check() {
        return "OK";
    }

    @GetMapping("/owm")
    public Weather getOWMconditions() {
        return service.getConditions();
    }
}
