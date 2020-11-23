package com.colony.cmc.controller;

import com.colony.cmc.exception.MessageNotFoundException;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandler.class);
    private static final String ERROR_MSG = "Request error";

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {MessageNotFoundException.class})
    public ResponseEntity<Map<String, String>> handleMessageNotFound(RuntimeException exception) {
        LOG.error(ERROR_MSG, exception);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", exception.getMessage()));
    }

}
