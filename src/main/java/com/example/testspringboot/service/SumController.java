package com.example.testspringboot.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
    private static final Logger log = LoggerFactory.getLogger(SumController.class);

    @GetMapping("/sum")
    public String printSum() {
        int a = 4;
        int b = 4;
        int c = a+b;
        String d = String.valueOf(c);
        log.info("Публикуем сумму...");
        return d;
    }
}
