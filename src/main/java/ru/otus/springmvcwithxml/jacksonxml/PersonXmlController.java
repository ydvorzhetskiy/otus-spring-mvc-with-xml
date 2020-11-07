package ru.otus.springmvcwithxml.jacksonxml;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonXmlController {

    @GetMapping(
        value = "/api/jackson-xml",
        produces = "application/xml"
    )
    public PersonXmlDto jacksonXml() {
        return new PersonXmlDto("Ivan", 18);
    }
}
