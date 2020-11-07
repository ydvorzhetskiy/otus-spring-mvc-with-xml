package ru.otus.springmvcwithxml.jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@JacksonXmlRootElement(
    namespace = "http://otus.ru/spring",
    localName = "person"
)
@RequiredArgsConstructor
@Getter
public class PersonXmlDto {

    private final String name;

    private final int age;
}
