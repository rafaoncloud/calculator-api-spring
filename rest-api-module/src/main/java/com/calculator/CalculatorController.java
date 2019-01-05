package com.calculator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CalculatorService;

@RestController
@Import(CalculatorService.class)
public class CalculatorController {

    private CalculatorService calculatorService;

    CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @RequestMapping(value = "/home", produces = MediaType.APPLICATION_JSON_VALUE)
    public String home() {
        return calculatorService.home();
    }
}
