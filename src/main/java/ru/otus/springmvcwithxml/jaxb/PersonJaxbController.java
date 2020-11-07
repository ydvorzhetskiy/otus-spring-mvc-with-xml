package ru.otus.springmvcwithxml.jaxb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonJaxbController {

    @GetMapping(
        value = "/api/jaxb-xml",
        produces = "application/xml"
    )
    public PersonJaxbDto jacksonXml() {
        return new PersonJaxbDto("Ivan", 18);
    }
}
