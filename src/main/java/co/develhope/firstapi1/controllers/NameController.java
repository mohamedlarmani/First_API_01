package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class NameController {
    private String name = "John";

    @GetMapping("/name")
    public String getName() {
        return name;
    }

    @PostMapping("/name")
    public String reverseName(@RequestBody String name) {
        StringBuilder reversed = new StringBuilder(name).reverse();
        return reversed.toString();
    }
}