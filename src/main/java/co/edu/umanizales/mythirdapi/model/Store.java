package co.edu.umanizales.mythirdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Store {
    private String code;
    private String name;
    private String address;
    private Location city;

    public Store(Location locationByCode, String name, String address, String s) {
    }
}