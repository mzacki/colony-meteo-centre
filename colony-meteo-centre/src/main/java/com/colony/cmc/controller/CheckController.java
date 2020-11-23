package com.colony.cmc.controller;

import com.colony.cmc.dto.AcwResponse;
import com.colony.cmc.dto.IcmResponse;
import com.colony.cmc.dto.OwmResponse;
import com.colony.cmc.dto.WtsResponse;
import com.colony.cmc.service.AcwService;
import com.colony.cmc.service.ControlService;
import com.colony.cmc.service.IcmService;
import com.colony.cmc.service.OwmService;
import com.colony.cmc.service.WtsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    private final AcwService acwService;
    private final IcmService icmService;
    private final OwmService owmService;
    private final WtsService wtsService;
    private final ControlService controlService;


    public CheckController(AcwService acwService, IcmService icmService,
            OwmService owmService, WtsService wtsService, ControlService controlService) {
        this.acwService = acwService;
        this.icmService = icmService;
        this.owmService = owmService;
        this.wtsService = wtsService;
        this.controlService = controlService;
    }

    @GetMapping("/check")
    public String check() {
        return "OK";
    }

    @GetMapping("/acw")
    public AcwResponse[] getAcwConditions() {
        return acwService.getConditions();
    }

    @GetMapping("/icm")
    public IcmResponse getIcmConditions() {
        return icmService.getConditions();
    }

    @GetMapping("/owm")
    public OwmResponse getOwmConditions() {
        return owmService.getConditions();
    }

    @GetMapping("/wts")
    public WtsResponse getWtsConditions() {
        return wtsService.getConditions();
    }

    @GetMapping("/error")
    public ResponseEntity<String> getErrorMessage(@RequestParam(value = "msg", required = false) String input) {
        return ResponseEntity.ok().body(controlService.getMessageOrError(input));
    }

}
