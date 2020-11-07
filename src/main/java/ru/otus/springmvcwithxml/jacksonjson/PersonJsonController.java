package ru.otus.springmvcwithxml.jacksonjson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonJsonController {

    @GetMapping("/api/json")
    public PersonJsonDto json() {
        return new PersonJsonDto("Ivan", 18);
    }
}
