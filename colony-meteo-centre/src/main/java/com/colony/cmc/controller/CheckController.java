package com.colony.cmc.controller;

import com.colony.cmc.dto.AcwResponse;
import com.colony.cmc.dto.OwmResponse;
import com.colony.cmc.dto.WtsResponse;
import com.colony.cmc.service.AcwService;
import com.colony.cmc.service.OwmService;
import com.colony.cmc.service.WtsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    private final AcwService acwService;
    private final OwmService owmService;
    private final WtsService wtsService;

    public CheckController(AcwService acwService, OwmService owmService, WtsService wtsService) {
        this.acwService = acwService;
        this.owmService = owmService;
        this.wtsService = wtsService;
    }

    @GetMapping("/check")
    public String check() {
        return "OK";
    }

    @GetMapping("/acw")
    public AcwResponse[] getAcwConditions() {
        return acwService.getConditions();
    }

    @GetMapping("/owm")
    public OwmResponse getOwmConditions() {
        return owmService.getConditions();
    }

    @GetMapping("/wts")
    public WtsResponse getWtsConditions() {
        return wtsService.getConditions();
    }
}
