package co.edu.umanizales.mythirdapi.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {
    private String name;
    private String lastname;
    private byte age;
    private char gender;
    private String identification;
    private Location city;
}
