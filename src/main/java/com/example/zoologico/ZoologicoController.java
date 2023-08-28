package com.example.zoologico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class ZoologicoController {
    @GetMapping("/zebra")
    public String getAnimals() {
        return "zebra";
    }
}
