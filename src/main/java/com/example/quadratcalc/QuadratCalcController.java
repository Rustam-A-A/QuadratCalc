package com.example.quadratcalc;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadratCalcController {

    @GetMapping("/squareside")
    public int calculateArea(@RequestParam int a) {
        int quadrat = a * a;
        return quadrat;

    }

}
