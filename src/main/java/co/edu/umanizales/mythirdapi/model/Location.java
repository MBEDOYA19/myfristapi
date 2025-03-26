package co.edu.umanizales.mythirdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    private String code;
    private String description;
    private String name;
    private String address;
    private String  city;
    private String state;

}
