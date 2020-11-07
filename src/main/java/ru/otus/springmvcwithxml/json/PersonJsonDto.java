package ru.otus.springmvcwithxml.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PersonJsonDto {

    @JsonProperty("firstName")
    private final String name;

    private final int age;
}
