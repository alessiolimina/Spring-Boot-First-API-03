package it.develhope.springboot.Spring.Boot.First.API3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {
    @GetMapping("/")
    public String getConcatenatedStrings(@RequestParam(required = true) String name, @RequestParam(required = false) String surname) {
        if (surname.equals(null)) {
            return name;
        } else return name + " " + surname;
    }
}
