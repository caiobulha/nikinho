package com.example.zoologico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/animals")
public class ZoologicoController {
    @GetMapping
    public String getAnimals() {
        return "zebra";
    }
}
