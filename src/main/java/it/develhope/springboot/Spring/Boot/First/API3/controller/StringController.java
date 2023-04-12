package it.develhope.springboot.Spring.Boot.First.API3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {
    @GetMapping("/")
    public String getConcatenatedStrings(@RequestParam(required = true) String string1, @RequestParam(required = false) String string2) {
        if (string2.isEmpty()) {
            return "printing just string1: " + string1;
        } else return string1 + " " + string2;
    }
}
