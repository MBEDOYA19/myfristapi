package co.edu.umanizales.mythirdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {
    private String identification;
    private TypeDocument typeDocument;
    private String name;
    private String lastName;
    private byte age;
    private Location city;
    private char gender;

    public Seller(String identification, String s, byte b, String lastName, Location locationByCode, char c) {
    }
}

