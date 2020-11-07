package ru.otus.springmvcwithxml.jaxb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
    namespace = "http://spring.otus.ru",
    name = "person-jaxb"
)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonJaxbDto {

    private String name;
    private int age;
}
