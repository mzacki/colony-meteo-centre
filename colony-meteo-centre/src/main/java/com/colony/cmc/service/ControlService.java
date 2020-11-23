package com.colony.cmc.service;

import com.colony.cmc.exception.MessageNotFoundException;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ControlService {


    public String getMessageOrError(String input) {
        Optional<String> message = Optional.ofNullable(input);
        return message.orElseThrow(() -> new MessageNotFoundException("Missing non compulsory parameter in request"));
    }

}
