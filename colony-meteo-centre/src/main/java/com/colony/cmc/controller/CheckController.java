package com.colony.cmc.controller;

import com.colony.cmc.dto.AcwResponse;
import com.colony.cmc.dto.OwmResponse;
import com.colony.cmc.service.AcwService;
import com.colony.cmc.service.OwmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    private final AcwService acwService;
    private final OwmService owmService;

    public CheckController(AcwService acwService, OwmService owmService) {
        this.acwService = acwService;
        this.owmService = owmService;
    }

    @GetMapping("/check")
    public String check() {
        return "OK";
    }

    @GetMapping("/owm")
    public OwmResponse getOwmConditions() {
        return owmService.getConditions();
    }

    @GetMapping("/acw")
    public AcwResponse[] getAcwConditions() {
        return acwService.getConditions();
    }
}
